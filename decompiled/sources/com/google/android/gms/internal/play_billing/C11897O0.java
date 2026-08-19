package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11897O0 extends AbstractC11969j1 {
    private static final C11897O0 zzb;
    private InterfaceC11985n1 zzd = C11874G1.f36130q0;

    static {
        C11897O0 c11897o0 = new C11897O0();
        zzb = c11897o0;
        AbstractC11969j1.m13476k(C11897O0.class, c11897o0);
    }

    /* JADX INFO: renamed from: n */
    public static C11894N0 m13312n() {
        return (C11894N0) zzb.m13480f();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: o */
    public static void m13313o(C11897O0 c11897o0, Iterable iterable) {
        InterfaceC11985n1 interfaceC11985n1 = c11897o0.zzd;
        if (!((AbstractC11911T0) interfaceC11985n1).f36192Y) {
            int size = interfaceC11985n1.size();
            c11897o0.zzd = interfaceC11985n1.mo13266e(size + size);
        }
        InterfaceC11985n1 interfaceC11985n2 = c11897o0.zzd;
        Charset charset = AbstractC11989o1.f36309a;
        iterable.getClass();
        if (iterable instanceof InterfaceC12005s1) {
            List listM13523a = ((InterfaceC12005s1) iterable).m13523a();
            if (interfaceC11985n2 != 0) {
                throw new ClassCastException();
            }
            interfaceC11985n2.size();
            Iterator it = listM13523a.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof C11929Z0) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                C11929Z0.m13375p(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof InterfaceC11868E1) {
            interfaceC11985n2.addAll((Collection<? extends E>) ((Collection) iterable));
            return;
        }
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (interfaceC11985n2 instanceof ArrayList) {
                ((ArrayList) interfaceC11985n2).ensureCapacity(interfaceC11985n2.size() + size2);
            }
            if (interfaceC11985n2 instanceof C11874G1) {
                C11874G1 c11874g1 = (C11874G1) interfaceC11985n2;
                int i10 = ((C11874G1) interfaceC11985n2).f36132o0 + size2;
                int length = c11874g1.f36131Z.length;
                if (i10 > length) {
                    if (length != 0) {
                        while (length < i10) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        c11874g1.f36131Z = Arrays.copyOf(c11874g1.f36131Z, length);
                    } else {
                        c11874g1.f36131Z = new Object[Math.max(i10, 10)];
                    }
                }
            }
        }
        int size3 = interfaceC11985n2.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    AbstractC11965i1.m13470a(size3, interfaceC11985n2);
                    throw null;
                }
                interfaceC11985n2.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size4 = list.size();
        for (int i11 = 0; i11 < size4; i11++) {
            Object obj2 = list.get(i11);
            if (obj2 == null) {
                AbstractC11965i1.m13470a(size3, interfaceC11985n2);
                throw null;
            }
            interfaceC11985n2.add(obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C11891M0.class});
        }
        if (i11 == 3) {
            return new C11897O0();
        }
        if (i11 == 4) {
            return new C11894N0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
