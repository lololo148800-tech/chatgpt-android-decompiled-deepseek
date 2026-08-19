package p805i9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.SparseArray;
import java.util.HashMap;
import p522V8.EnumC7837d;

/* JADX INFO: renamed from: i9.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14950a {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f46569a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public static final HashMap f46570b;

    static {
        HashMap map = new HashMap();
        f46570b = map;
        map.put(EnumC7837d.f24731Y, 0);
        map.put(EnumC7837d.f24732Z, 1);
        map.put(EnumC7837d.f24733o0, 2);
        for (EnumC7837d enumC7837d : map.keySet()) {
            f46569a.append(((Integer) f46570b.get(enumC7837d)).intValue(), enumC7837d);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m16111a(EnumC7837d enumC7837d) {
        Integer num = (Integer) f46570b.get(enumC7837d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC7837d);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC7837d m16112b(int i10) {
        EnumC7837d enumC7837d = (EnumC7837d) f46569a.get(i10);
        if (enumC7837d != null) {
            return enumC7837d;
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Unknown Priority for value "));
    }
}
