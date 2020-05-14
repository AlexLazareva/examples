package beans;

import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class ColorBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
           PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
           PropertyDescriptor propertyDescriptors[] = {rectangular};
           return propertyDescriptors;
        } catch (Exception e) {
            System.out.println("Перехвачено событие. " + e);
        }
        return null;
    }
}
