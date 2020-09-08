package internetShop.repository;

import internetShop.entity.bucket.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BucketRepository extends JpaRepository<Bucket, Long> {
    Bucket findByUserId(Long userId);
}
