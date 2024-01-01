package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (outsourcedPartRepository.count() == 0) {
            OutsourcedPart oneStub = new OutsourcedPart();
            oneStub.setCompanyName("The Brick");
            oneStub.setName("One Stub Block");
            oneStub.setInv(5);
            oneStub.setPrice(0.5);
            oneStub.setId(100L);
            oneStub.setMinInv(1);
            oneStub.setMaxInv(50);
            outsourcedPartRepository.save(oneStub);
            OutsourcedPart oneStubBlock = null;

            OutsourcedPart twoStub = new OutsourcedPart();
            twoStub.setCompanyName("The Brick");
            twoStub.setName("Two Stub Block");
            twoStub.setInv(5);
            twoStub.setPrice(0.5);
            twoStub.setId(101L);
            twoStub.setMinInv(5);
            twoStub.setMaxInv(75);
            outsourcedPartRepository.save(twoStub);
            OutsourcedPart twoStubBlock = null;

            OutsourcedPart lBlock = new OutsourcedPart();
            lBlock.setCompanyName("The Brick");
            lBlock.setName("L Shaped Block");
            lBlock.setInv(10);
            lBlock.setPrice(0.75);
            lBlock.setId(102L);
            lBlock.setMinInv(1);
            lBlock.setMaxInv(20);
            outsourcedPartRepository.save(lBlock);
            OutsourcedPart lShapeBlock = null;

            OutsourcedPart flatBlock = new OutsourcedPart();
            flatBlock.setCompanyName("The Brick");
            flatBlock.setName("Flat Block");
            flatBlock.setInv(5);
            flatBlock.setPrice(0.25);
            flatBlock.setId(103L);
            flatBlock.setMinInv(1);
            flatBlock.setMaxInv(20);
            outsourcedPartRepository.save(flatBlock);
            OutsourcedPart flatSurfaceBlock = null;

            OutsourcedPart doubleFlat = new OutsourcedPart();
            doubleFlat.setCompanyName("The Brick");
            doubleFlat.setName("Double Flat Block");
            doubleFlat.setInv(10);
            doubleFlat.setPrice(0.75);
            doubleFlat.setId(104L);
            doubleFlat.setMinInv(5);
            doubleFlat.setMaxInv(75);
            outsourcedPartRepository.save(doubleFlat);
            OutsourcedPart doubleFlatBlock = null;

            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("One Stub Block")) oneStubBlock = part;
                if (part.getName().equals("Two Stub Block")) twoStubBlock = part;
                if (part.getName().equals("L Shaped Block")) lShapeBlock = part;
                if (part.getName().equals("Flat Block")) flatSurfaceBlock = part;
                if (part.getName().equals("Double Flat Block")) doubleFlatBlock = part;
            }

            System.out.println(oneStubBlock.getCompanyName());
            System.out.println(twoStubBlock.getCompanyName());
            System.out.println(lShapeBlock.getCompanyName());
            System.out.println(flatSurfaceBlock.getCompanyName());
            System.out.println(doubleFlatBlock.getCompanyName());

            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }
        }

        if (productRepository.count() == 0) {
            Product flowerBouquet = new Product("Flower Bouquet Set", 44.99, 15);
            Product wildFlowerBouquet = new Product("Wildflower Bouquet Set", 44.99, 10);
            Product orchidBouquet = new Product("Orchid Set", 39.99, 5);
            Product succulentSet = new Product("Succulent Set", 49.99, 20);
            Product insectCollection = new Product("Insect Collection Set", 49.99, 10);
            productRepository.save(flowerBouquet);
            productRepository.save(wildFlowerBouquet);
            productRepository.save(orchidBouquet);
            productRepository.save(succulentSet);
            productRepository.save(insectCollection);

            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());
        }
    }
}
