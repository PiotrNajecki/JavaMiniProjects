package pl.pathvatiablesspringmvc;

import java.util.List;

public interface CompanyRepository {
    List<Company> findAll();
    Company findOne(String name);
    Company save(Company company);
    List<Company> save(List<Company> companies);
}
