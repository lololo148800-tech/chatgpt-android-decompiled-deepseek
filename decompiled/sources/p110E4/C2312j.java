package p110E4;

import io.sentry.android.core.AbstractC15256t;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC16544l;
import p1075w5.C20836n;
import p134F4.AbstractC2664a;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: E4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2312j {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f7192a;

    public C2312j(C20836n c20836n) {
        this.f7192a = AbstractC17659D.m19256r(c20836n.f66254Y);
    }

    /* JADX INFO: renamed from: a */
    public void m3416a(AbstractC2664a... migrations) {
        AbstractC16544l.m18094g(migrations, "migrations");
        for (AbstractC2664a abstractC2664a : migrations) {
            int i10 = abstractC2664a.f8174a;
            LinkedHashMap linkedHashMap = this.f7192a;
            Integer numValueOf = Integer.valueOf(i10);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            int i11 = abstractC2664a.f8175b;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                AbstractC15256t.m16482t("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + abstractC2664a);
            }
            treeMap2.put(Integer.valueOf(i11), abstractC2664a);
        }
    }

    public C2312j() {
        this.f7192a = new LinkedHashMap();
    }
}
