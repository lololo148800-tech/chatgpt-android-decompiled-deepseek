package p003A1;

import android.os.Bundle;
import androidx.activity.AbstractActivityC10817a;
import androidx.fragment.app.AbstractActivityC11001b;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.EnumC11103l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p183H4.InterfaceC3230e;
import p562X0.C9017l;
import p588Y2.C9606J;
import p772h.C14227i;
import p791hj.C14518a;
import p791hj.C14522e;

/* JADX INFO: renamed from: A1.Q0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0199Q0 implements InterfaceC3230e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f741a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f742b;

    public /* synthetic */ C0199Q0(Object obj, int i10) {
        this.f741a = i10;
        this.f742b = obj;
    }

    @Override // p183H4.InterfaceC3230e
    /* JADX INFO: renamed from: a */
    public final Bundle mo612a() {
        switch (this.f741a) {
            case 0:
                Map mapM9596c = ((C9017l) this.f742b).m9596c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : ((LinkedHashMap) mapM9596c).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                AbstractActivityC11001b abstractActivityC11001b = (AbstractActivityC11001b) this.f742b;
                while (AbstractActivityC11001b.m11761o(abstractActivityC11001b.m11762n())) {
                }
                abstractActivityC11001b.f33166H0.m12170f(EnumC11103l.ON_STOP);
                return new Bundle();
            case 2:
                return ((C9606J) this.f742b).m11782S();
            case 3:
                return C11082S.m12130a((C11082S) this.f742b);
            case 4:
                AbstractActivityC10817a abstractActivityC10817a = (AbstractActivityC10817a) this.f742b;
                Bundle bundle2 = new Bundle();
                C14227i c14227i = abstractActivityC10817a.f32069u0;
                c14227i.getClass();
                LinkedHashMap linkedHashMap = c14227i.f44671b;
                bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c14227i.f44673d));
                bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c14227i.f44676g));
                return bundle2;
            default:
                C14522e c14522e = (C14522e) this.f742b;
                c14522e.getClass();
                Bundle bundle3 = new Bundle();
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) c14522e.f45761Y;
                if (linkedHashMap2 != null) {
                    for (C14518a c14518a : ((LinkedHashMap) c14522e.f45762Z).values()) {
                        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c14522e.f45761Y;
                        if (linkedHashMap3 != null) {
                            Bundle bundle4 = new Bundle();
                            c14518a.f45753o0.m351u(bundle4);
                            linkedHashMap3.put(c14518a.f45751Y, bundle4);
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        bundle3.putBundle((String) entry2.getKey(), (Bundle) entry2.getValue());
                    }
                }
                return bundle3;
        }
    }
}
