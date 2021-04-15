package in.nareshit.raja;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pi")
public class ProductInfo {
@Value("${my.app.title}")
private String title;

@Override
public String toString() {
	return "ProductInfo [title=" + title + "]";
}

}
