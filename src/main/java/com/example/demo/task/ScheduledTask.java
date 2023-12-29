package com.example.demo.task;

import net.javacrumbs.shedlock.core.SchedulerLock;
import okhttp3.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @descriptions:
 * @author: Liu XuChao
 * @date: 2023/10/23 15:45
 * @version: 1.0
 */
@Component
public class ScheduledTask {


    @Scheduled(cron = "0/9 * * * * ? ")
    @SchedulerLock(name = "all") //name的值就是下面方法的名字,默认为锁名字
    public void all() throws Exception {
        System.out.println(System.currentTimeMillis());
        Thread.sleep(12000);
        System.out.println("定时任务执行!!!!");
        System.out.println(System.currentTimeMillis());

    }

    public static void main(String[] args) throws IOException {
        try {
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(30, TimeUnit.SECONDS) // 增加连接超时时间为30秒
                    .readTimeout(30, TimeUnit.SECONDS)
                    .build();

            MediaType mediaType = MediaType.parse("application/json");

            // 替换为你的 API 密钥和模型 ID
            String apiKey = "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";
            String modelID = "gpt-3.5-turbo";

            // 构建请求体
            String requestBody = "{\"prompt\": \"你好，我是ChatGPT。\", \"max_tokens\": 50}";

            RequestBody body = RequestBody.create(mediaType, requestBody);

            // 构建请求
            Request request = new Request.Builder()
                    // .url("https://api.openai.com/v1/engines/" + modelID + "/completions")
                    .url("https://api.openai.com/v1/engines")
                    .post(body)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Authorization", "Bearer " + apiKey)
                    .build();

            // 发送请求并获取响应
            Response response = client.newCall(request).execute();

            if (response.isSuccessful() && response.body() != null) {
                String responseBody = response.body().string();
                System.out.println("Response: " + responseBody);
            } else {
                System.out.println("Request failed");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
