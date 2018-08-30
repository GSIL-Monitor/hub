package spring.di;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by songweiliang on 2017/12/18.
 */
@Component
@Profile("prd")
public class ProfileDemo2 {
    public void getName(){}
}
