package org.launchcode.deedaday.models.Data;


        import org.launchcode.deedaday.models.Deed;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Component;
        import org.springframework.stereotype.Repository;
        import javax.transaction.Transactional;


@Repository
@Component
@Transactional
public interface DeedDao extends CrudRepository<Deed, Integer> {}

