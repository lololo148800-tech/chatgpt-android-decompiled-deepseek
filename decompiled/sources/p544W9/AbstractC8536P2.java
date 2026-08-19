package p544W9;

import android.view.View;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0152A1;
import p030B2.C0743Y;
import p1091wn.C21030k;
import p256K2.C4532a;
import p523V9.AbstractC7846A5;
import p895n1.C17425e;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: W9.P2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8536P2 {

    /* JADX INFO: renamed from: a */
    public static C17425e f26362a;

    /* JADX INFO: renamed from: a */
    public static final void m9198a(View view) {
        AbstractC16544l.m18094g(view, "<this>");
        C21030k c21030kM8098a = AbstractC7846A5.m8098a(new C0743Y(view, null));
        while (c21030kM8098a.hasNext()) {
            ArrayList arrayList = m9199b((View) c21030kM8098a.next()).f14809a;
            for (int iM19381j = AbstractC17681o.m19381j(arrayList); -1 < iM19381j; iM19381j--) {
                ((C0152A1) arrayList.get(iM19381j)).f628a.m734e();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C4532a m9199b(View view) {
        C4532a c4532a = (C4532a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c4532a != null) {
            return c4532a;
        }
        C4532a c4532a2 = new C4532a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c4532a2);
        return c4532a2;
    }
}
