package p214Ib;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import p265Kb.C4615h;
import p288Lb.AbstractC4973f;
import p288Lb.AbstractC4992y;
import p288Lb.C4969b;
import p288Lb.C4972e;
import p288Lb.C4985r;
import p288Lb.C4988u;
import p358Ob.AbstractC6164c;
import p358Ob.C6163b;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Ib.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3670m {

    /* JADX INFO: renamed from: a */
    public final C4615h f11158a = C4615h.f15042o0;

    /* JADX INFO: renamed from: b */
    public final int f11159b = 1;

    /* JADX INFO: renamed from: c */
    public final EnumC3665h f11160c = EnumC3665h.f11142Y;

    /* JADX INFO: renamed from: d */
    public final HashMap f11161d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final ArrayList f11162e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f11163f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public String f11164g = null;

    /* JADX INFO: renamed from: h */
    public final int f11165h = 2;

    /* JADX INFO: renamed from: i */
    public final int f11166i = 2;

    /* JADX INFO: renamed from: j */
    public final boolean f11167j = true;

    /* JADX INFO: renamed from: k */
    public final boolean f11168k = true;

    /* JADX INFO: renamed from: l */
    public EnumC3655A f11169l = EnumC3655A.f11138Y;

    /* JADX INFO: renamed from: m */
    public final EnumC3655A f11170m = EnumC3655A.f11139Z;

    /* JADX INFO: renamed from: n */
    public final LinkedList f11171n = new LinkedList();

    /* JADX WARN: Code duplicated, block: B:10:0x006d A[PHI: r5
      0x006d: PHI (r5v3 Lb.u) = (r5v2 Lb.u), (r5v9 Lb.u) binds: [B:16:0x0084, B:7:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x00ae  */
    /* JADX INFO: renamed from: a */
    public final C3669l m4378a() {
        int i10;
        C4988u c4988u;
        C4988u c4988u2;
        C4988u c4988u3;
        ArrayList arrayList = this.f11162e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f11163f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        String str = this.f11164g;
        boolean z6 = AbstractC6164c.f20069a;
        C4972e c4972e = AbstractC4973f.f16208b;
        C4988u c4988u4 = null;
        if (str == null || str.trim().isEmpty()) {
            int i11 = this.f11165h;
            if (i11 != 2 && (i10 = this.f11166i) != 2) {
                C4969b c4969b = new C4969b(c4972e, i11, i10);
                C4988u c4988u5 = AbstractC4992y.f16272a;
                c4988u = new C4988u(Date.class, c4969b, 0);
                if (z6) {
                    C6163b c6163b = AbstractC6164c.f20071c;
                    c6163b.getClass();
                    c4988u2 = new C4988u(c6163b.f16209a, new C4969b(c6163b, i11, i10), 0);
                    C6163b c6163b2 = AbstractC6164c.f20070b;
                    c6163b2.getClass();
                    c4988u3 = new C4988u(c6163b2.f16209a, new C4969b(c6163b2, i11, i10), 0);
                    c4988u4 = c4988u2;
                } else {
                    c4988u3 = null;
                }
                arrayList3.add(c4988u);
                if (z6) {
                    arrayList3.add(c4988u4);
                    arrayList3.add(c4988u3);
                }
            }
        } else {
            C4969b c4969b2 = new C4969b(c4972e, str);
            C4988u c4988u6 = AbstractC4992y.f16272a;
            c4988u = new C4988u(Date.class, c4969b2, 0);
            if (z6) {
                C6163b c6163b3 = AbstractC6164c.f20071c;
                c6163b3.getClass();
                c4988u2 = new C4988u(c6163b3.f16209a, new C4969b(c6163b3, str), 0);
                C6163b c6163b4 = AbstractC6164c.f20070b;
                c6163b4.getClass();
                c4988u3 = new C4988u(c6163b4.f16209a, new C4969b(c6163b4, str), 0);
                c4988u4 = c4988u2;
            } else {
                c4988u3 = null;
            }
            arrayList3.add(c4988u);
            if (z6) {
                arrayList3.add(c4988u4);
                arrayList3.add(c4988u3);
            }
        }
        return new C3669l(this.f11158a, this.f11160c, new HashMap(this.f11161d), this.f11167j, this.f11168k, this.f11159b, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f11169l, this.f11170m, new ArrayList(this.f11171n));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m4379b(Type type, InterfaceC3672o interfaceC3672o) {
        Objects.requireNonNull(type);
        ArrayList arrayList = this.f11162e;
        TypeToken<?> typeToken = TypeToken.get(type);
        arrayList.add(new C4985r(interfaceC3672o, typeToken, typeToken.getType() == typeToken.getRawType()));
        if (interfaceC3672o instanceof AbstractC3656B) {
            C4988u c4988u = AbstractC4992y.f16272a;
            arrayList.add(new C4988u(TypeToken.get(type), (AbstractC3656B) interfaceC3672o, 2));
        }
    }
}
