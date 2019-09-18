package org.xmuyoo.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrawlRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    private Long id;

    @JsonProperty
    @Column(columnDefinition = "timestamp with time zone", nullable = false)
    private LocalDateTime crawledDatetime;

    @JsonProperty
    @Column
    private boolean success;

    @JsonProperty
    @ManyToOne(cascade = CascadeType.ALL)
    private CrawlTask crawlTask;
}
