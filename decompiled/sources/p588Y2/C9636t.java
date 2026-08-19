package p588Y2;

import android.os.Bundle;
import androidx.activity.AbstractActivityC10817a;
import androidx.fragment.app.AbstractActivityC11001b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p183H4.C3231f;
import p772h.C14227i;
import p816j.InterfaceC16029a;

/* JADX INFO: renamed from: Y2.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9636t implements InterfaceC16029a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractActivityC10817a f29049b;

    public /* synthetic */ C9636t(AbstractActivityC10817a abstractActivityC10817a, int i10) {
        this.f29048a = i10;
        this.f29049b = abstractActivityC10817a;
    }

    @Override // p816j.InterfaceC16029a
    /* JADX INFO: renamed from: a */
    public final void mo10190a(AbstractActivityC10817a it) {
        switch (this.f29048a) {
            case 0:
                C9637u c9637u = (C9637u) ((AbstractActivityC11001b) this.f29049b).f33165G0.f42000Z;
                c9637u.f29053p0.m11791b(c9637u, c9637u, null);
                break;
            default:
                AbstractActivityC10817a abstractActivityC10817a = this.f29049b;
                AbstractC16544l.m18094g(it, "it");
                Bundle bundleM4122c = ((C3231f) abstractActivityC10817a.f32064p0.f405p0).m4122c("android:support:activity-result");
                if (bundleM4122c != null) {
                    C14227i c14227i = abstractActivityC10817a.f32069u0;
                    c14227i.getClass();
                    ArrayList<Integer> integerArrayList = bundleM4122c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM4122c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleM4122c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            c14227i.f44673d.addAll(stringArrayList2);
                        }
                        Bundle bundle = bundleM4122c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c14227i.f44676g;
                        if (bundle != null) {
                            bundle2.putAll(bundle);
                        }
                        int size = stringArrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            String str = stringArrayList.get(i10);
                            LinkedHashMap linkedHashMap = c14227i.f44671b;
                            boolean zContainsKey = linkedHashMap.containsKey(str);
                            LinkedHashMap linkedHashMap2 = c14227i.f44670a;
                            if (zContainsKey) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    AbstractC16529F.m18079c(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i10);
                            AbstractC16544l.m18093f(num2, "rcs[i]");
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i10);
                            AbstractC16544l.m18093f(str2, "keys[i]");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            linkedHashMap.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
        }
    }
}
