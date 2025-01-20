package org.example.testnode;

import lombok.*;

@Builder
@Getter
@Setter
@ToString(exclude = {"yesNode", "noNode"}) // yesNode 와 noNode 는 출력되지 않게
public class TestNode {

	private String question;
	private TestNode yesNode;
	private TestNode noNode;
	private String result;

}
