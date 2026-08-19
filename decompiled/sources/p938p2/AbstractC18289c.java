package p938p2;

import android.content.pm.ShortcutInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: p2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18289c {
    /* JADX INFO: renamed from: a */
    public static String m19830a(List list) {
        Iterator it = list.iterator();
        int rank = -1;
        String id2 = null;
        while (it.hasNext()) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
            if (shortcutInfo.getRank() > rank) {
                id2 = shortcutInfo.getId();
                rank = shortcutInfo.getRank();
            }
        }
        return id2;
    }
}
