package com.lujiaxin.coke.domain.vo;

import com.lujiaxin.coke.domain.Action;
import com.lujiaxin.coke.domain.ActionRule;
import com.lujiaxin.coke.domain.ActionRuleScore;
import com.lujiaxin.coke.domain.ActionScript;
import com.sun.javafx.css.Rule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActionAllVo {

    private List<Action> actions;
    private List<ActionScript> actionScripts;
    private List<ActionRule> actionRules;
    private List<ActionRuleScore> actionRuleScores;

}
