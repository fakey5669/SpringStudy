package Spring1.SpringCoreBasic.web;

import Spring1.SpringCoreBasic.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    private final MyLogger myLogger;

    public void logic(String id) {
        System.out.println("service id = " + id);
    }
}
