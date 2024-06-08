package com.rafat;

import org.testng.annotations.Test;

public class Open_url extends Open{
    @Test
    public void run() throws InterruptedException {
        driver.get("https://swap.com.bd/");
        Thread.sleep(5000);
    }
}
