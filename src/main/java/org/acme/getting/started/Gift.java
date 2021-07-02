package org.acme.getting.started;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Gift implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @SequenceGenerator(name = "giftSeq", sequenceName = "gift_id_seq", allocationSize = 1, initialValue = 1)
  @GeneratedValue(generator = "giftSeq")
  private Long id;

  @NotBlank(message = "Name is mandatory")
  private String name;
}
