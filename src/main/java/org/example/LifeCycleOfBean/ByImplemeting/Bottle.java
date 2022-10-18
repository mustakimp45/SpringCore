package org.example.LifeCycleOfBean.ByImplemeting;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bottle implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Bean is Initialized...!" +
                "and Bottle is opened...!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bottle has been closed...!" +
                "and destroyed the bottle Object...!");

    }


}
