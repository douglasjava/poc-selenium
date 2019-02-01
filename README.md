# POC Selenuim

Spring Boot Server 


## Overview  
This project is a poc for test with selenuim.

## Configuration
#### Firefox
- System.setProperty("webdriver.gecko.driver", "D:\\Douglas\\drivers-selenium\\geckodriver.exe");
- WebDriver webDriver = new FirefoxDriver();

#### Chrome
- System.setProperty("webdriver.chrome.driver", "D:\\Douglas\\drivers-selenium\\chromedriver.exe");
- WebDriver webDriver = new ChromeDriver();

#### Fechar 
- Fecha o browser
- webDriver.quit();
- Fecha apenas a ABA que abriu.
- webDriver.close();