package ma.enset.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LockAspect {
    @Around("@annotation(Lock)")
    public void lock(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("This method is locked!");
    }
}
