/*
package internetShop.service;

import internetShop.entity.Country;
import internetShop.entity.bucket.Bucket;
import internetShop.entity.product.HandMadeProduct;
import internetShop.repository.ProductRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

//@RunWith(MockitoJUnitRunner.class)
class ProductServiceImplTest {

   // @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    //@Test
    void testMockProduct() {
        TestingService mockTestService = Mockito.mock(TestingService.class, Mockito.CALLS_REAL_METHODS);
        Mockito.when(mockTestService.testing()).thenReturn("TestRepo");
        //assert (mockRepo.testing().getName().equals("TestRepo"));
    }

   // @Test
    void saveProductMock() {
        HandMadeProduct product = new HandMadeProduct("testingProd", "fvd", 32, new Country(), new Bucket());
        product.setId(15L);
        ProductRepository mockRepo = Mockito.mock(ProductRepository.class, Mockito.CALLS_REAL_METHODS);
        Mockito.doThrow(NullPointerException.class).when(mockRepo).findByName("cdjs");
        System.out.println(mockRepo.findByName("tea").getName());
        mockRepo.save(product);
        // assert (mockRepo.findByName("testingProd").getName().equals(product.getName()));
    }
}*/
