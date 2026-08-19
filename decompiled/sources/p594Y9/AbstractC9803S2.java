package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import bf.EnumC11347B;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p025An.C0644w;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p527Ve.C8269f;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p919o8.C17907J0;

/* JADX INFO: renamed from: Y9.S2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9803S2 {
    /* JADX INFO: renamed from: a */
    public static C17907J0 m10425a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C17907J0(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Application", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Application", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Application", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final List m10426b(List list, boolean z6) {
        C8269f c8269f;
        List listM19335K;
        C17309l c17309l = new C17309l(EnumC11347B.Python, new C8269f(R.string.conversation_details_capabilities_data));
        EnumC11347B enumC11347B = EnumC11347B.Browser;
        if (z6) {
            c8269f = new C8269f(R.string.conversation_details_capabilities_web_search);
        } else {
            if (z6) {
                throw new C0644w();
            }
            c8269f = new C8269f(R.string.conversation_details_capabilities_browsing);
        }
        Map mapM19244f = AbstractC17659D.m19244f(c17309l, new C17309l(enumC11347B, c8269f), new C17309l(EnumC11347B.Function, new C8269f(R.string.conversation_details_capabilities_functions)), new C17309l(EnumC11347B.Dalle, new C8269f(R.string.conversation_details_capabilities_dalle)), new C17309l(EnumC11347B.Memory, new C8269f(R.string.conversation_details_capabilities_memory)));
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C8269f c8269f2 = (C8269f) mapM19244f.get((EnumC11347B) it.next());
                if (c8269f2 != null) {
                    arrayList.add(c8269f2);
                }
            }
            listM19335K = AbstractC17680n.m19335K(arrayList);
        } else {
            listM19335K = null;
        }
        return listM19335K == null ? C17689w.f56480Y : listM19335K;
    }
}
