package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.mapping.MemberAgree;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Terms extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(20)")
    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;

    private Boolean optional;

    @OneToMany(mappedBy = "terms",cascade = CascadeType.ALL)
    private List<MemberAgree> MemberAgreeList =new ArrayList<>();
}
