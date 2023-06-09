package com.example.meditationguide.data

import com.example.meditationguide.R
import com.example.meditationguide.model.Stage

object StagesData{
    fun getStagesData(): ArrayList<Stage> {
        return arrayListOf(
            Stage(
                id = 1,
                titleResourceId = R.string.stage_1,
                subTitleResourceId = R.string.stage1_goal_text,
                imageResourceId = R.drawable.icon_stage_1,
                stagesImageBanner = R.drawable.img_stage_1,
                stageGoal = R.string.stage1_goal_text,
                keySkills = R.string.skill1_detail_text,
                masteryCondition = R.string.mastery1_detail_text
            ),
            Stage(
                id = 2,
                titleResourceId = R.string.stage_2,
                subTitleResourceId = R.string.stage2_goal_text,
                imageResourceId = R.drawable.icon_stage_2,
                stagesImageBanner = R.drawable.img_stage_2,
                stageGoal = R.string.stage2_goal_text,
                keySkills = R.string.skill2_detail_text,
                masteryCondition = R.string.mastery2_detail_text
                ),
            Stage(
                id = 3,
                titleResourceId = R.string.stage_3,
                subTitleResourceId = R.string.stage3_goal_text,
                imageResourceId = R.drawable.icon_stage_3,
                stagesImageBanner = R.drawable.img_stage_3,
                stageGoal = R.string.stage3_goal_text,
                keySkills = R.string.skill3_detail_text,
                masteryCondition = R.string.mastery3_detail_text
                ),
            Stage(
                id = 4,
                titleResourceId = R.string.stage_4,
                subTitleResourceId = R.string.stage4_goal_text,
                imageResourceId = R.drawable.icon_stage_4,
                stagesImageBanner = R.drawable.img_stage_4,
                stageGoal = R.string.stage4_goal_text,
                keySkills = R.string.skill4_detail_text,
                masteryCondition = R.string.mastery4_detail_text
                ),
            Stage(
                id = 5,
                titleResourceId = R.string.stage_5,
                subTitleResourceId = R.string.stage5_goal_text,
                imageResourceId = R.drawable.icon_stage_5,
                stagesImageBanner = R.drawable.img_stage_5,
                stageGoal = R.string.stage5_goal_text,
                keySkills = R.string.skill5_detail_text,
                masteryCondition = R.string.mastery5_detail_text
                ),
            Stage(
                id = 6,
                titleResourceId = R.string.stage_6,
                subTitleResourceId = R.string.stage6_goal_text,
                imageResourceId = R.drawable.icon_stage_6,
                stagesImageBanner = R.drawable.img_stage_6,
                stageGoal = R.string.stage6_goal_text,
                keySkills = R.string.skill6_detail_text,
                masteryCondition = R.string.mastery6_detail_text

            ),
            Stage(
                id = 7,
                titleResourceId = R.string.stage_7,
                subTitleResourceId = R.string.stage7_goal_text,
                imageResourceId = R.drawable.icon_stage_7,
                stagesImageBanner = R.drawable.img_stage_7,
                stageGoal = R.string.stage7_goal_text,
                keySkills = R.string.skill7_detail_text,
                masteryCondition = R.string.mastery7_detail_text
            ),
            Stage(
                id = 8,
                titleResourceId = R.string.stage_8,
                subTitleResourceId = R.string.stage8_goal_text,
                imageResourceId = R.drawable.icon_stage_8,
                stagesImageBanner = R.drawable.img_stage_8,
                stageGoal = R.string.stage8_goal_text,
                keySkills = R.string.skill8_detail_text,
                masteryCondition = R.string.mastery8_detail_text
            ),
            Stage(
                id = 9,
                titleResourceId = R.string.stage_9,
                subTitleResourceId = R.string.stage9_goal_text,
                imageResourceId = R.drawable.icon_stage_9,
                stagesImageBanner = R.drawable.img_stage_9,
                stageGoal = R.string.stage9_goal_text,
                keySkills = R.string.skill9_detail_text,
                masteryCondition = R.string.mastery9_detail_text
            ),
            Stage(
                id = 10,
                titleResourceId = R.string.stage_10,
                subTitleResourceId = R.string.stage10_goal_text,
                imageResourceId = R.drawable.icon_stage_10,
                stagesImageBanner = R.drawable.img_stage_10,
                stageGoal = R.string.stage10_goal_text,
                keySkills = R.string.skill10_detail_text,
                masteryCondition = R.string.mastery10_detail_text
            ),
//            Stage(
//                id = 11,
//                titleResourceId = R.string.tennis,
//                subTitleResourceId = R.string.tennis_subtitle,
//                imageResourceId = R.drawable.icon_stage_6,
//                stagesImageBanner = R.drawable.img_stage_6,
//                stageGoal = R.string.stage6_goal_text,
//                keySkills = R.string.skill6_detail_text,
//                masteryCondition = R.string.mastery6_detail_text
//            )
        )
    }
}