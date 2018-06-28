package com.tutorialspoint;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;
public class CustomEventPublisher
        implements ApplicationEventPublisherAware,InitializingBean,DisposableBean {
    private ApplicationEventPublisher publisher;



    public void afterPropertiesSet(){
        System.out.println("afterPropertiesSet");
    }

    public void destroy(){
        System.out.println("destroy");
    }
    public void setApplicationEventPublisher
            (ApplicationEventPublisher publisher){
        System.out.println("setApplicationEventPublisher");
        this.publisher = publisher;
    }
    public void publish() {
        CustomEvent ce = new CustomEvent(this);
        publisher.publishEvent(ce);
    }
}