package com.example.array.factory;
import com.example.array.entity.CustomArray;
import com.example.array.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CustomArrayFactory implements ArrayFactory {
    private static final Logger logger = LogManager.getLogger(CustomArrayFactory.class);
    @Override
    public CustomArray createArray(int[] data) throws CustomArrayException {
        if (data == null) {
            logger.error("Attempt to create array with null data");
            throw new CustomArrayException("Array data cannot be null");
        }
        if (data.length == 0) {
            logger.warn("Creating an empty array");
        }
        CustomArray array = new CustomArray(data);
        logger.info("Created array: {}", array);
        return array;
    }
}