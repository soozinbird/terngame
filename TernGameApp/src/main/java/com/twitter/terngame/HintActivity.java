package com.twitter.terngame;

import android.app.ListActivity;
import android.os.Bundle;

import com.twitter.terngame.data.HintInfo;

import java.util.ArrayList;


public class HintActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hint_activity);

        Session s = Session.getInstance(this);
/*        ArrayList<String> puzzleIDArray = s.getPuzzleList();
        // construct the array based on the puzzle order
        ArrayList<TeamStatus.PuzzleStatus> puzzleArray = new ArrayList<TeamStatus.PuzzleStatus>();

        for (String puzzleID : puzzleIDArray) {
            TeamStatus.PuzzleStatus ps = s.getPuzzleStatus(puzzleID);
            if (ps != null) {
                puzzleArray.add(ps);
            }
        }
*/
        final HintArrayAdapter adapter = new HintArrayAdapter(this, new ArrayList<HintInfo>());
        setListAdapter(adapter);
    }

}
