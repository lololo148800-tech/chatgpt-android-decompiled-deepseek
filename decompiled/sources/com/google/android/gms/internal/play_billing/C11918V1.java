package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.V1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11918V1 extends AbstractC11969j1 {
    private static final C11918V1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C11930Z1 zzh;

    static {
        C11918V1 c11918v1 = new C11918V1();
        zzb = c11918v1;
        AbstractC11969j1.m13476k(C11918V1.class, c11918v1);
    }

    /* JADX INFO: renamed from: n */
    public static C11918V1 m13356n(byte[] bArr, C11941c1 c11941c1) throws C11997q1 {
        AbstractC11969j1 abstractC11969j1 = zzb;
        int length = bArr.length;
        if (length != 0) {
            abstractC11969j1 = (AbstractC11969j1) abstractC11969j1.mo13306d(4);
            try {
                InterfaceC11880I1 interfaceC11880I1M13262a = C11871F1.f36125c.m13262a(abstractC11969j1.getClass());
                C11917V0 c11917v0 = new C11917V0();
                c11941c1.getClass();
                interfaceC11880I1M13262a.mo13238b(abstractC11969j1, bArr, 0, length, c11917v0);
                interfaceC11880I1M13262a.mo13237a(abstractC11969j1);
            } catch (C11889L1 e10) {
                throw new C11997q1(e10.getMessage());
            } catch (C11997q1 e11) {
                throw e11;
            } catch (IOException e12) {
                if (e12.getCause() instanceof C11997q1) {
                    throw ((C11997q1) e12.getCause());
                }
                throw new C11997q1(e12.getMessage(), e12);
            } catch (IndexOutOfBoundsException unused) {
                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (abstractC11969j1 == null || AbstractC11969j1.m13477m(abstractC11969j1, true)) {
            return (C11918V1) abstractC11969j1;
        }
        throw new C11997q1(new C11889L1().getMessage());
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13357o(C11918V1 c11918v1, C11930Z1 c11930z1) {
        c11918v1.zzh = c11930z1;
        c11918v1.zzd |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m13358p(C11918V1 c11918v1, C11970j2 c11970j2) {
        c11918v1.zzf = c11970j2;
        c11918v1.zze = 4;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m13359q(C11918V1 c11918v1, int i10) {
        c11918v1.zzg = i10 - 1;
        c11918v1.zzd |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static C11915U1 m13360r() {
        return (C11915U1) zzb.m13480f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11969j1
    /* JADX INFO: renamed from: d */
    public final Object mo13306d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C11877H1(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C11905R0.f36173c, "zzh", C11970j2.class});
        }
        if (i11 == 3) {
            return new C11918V1();
        }
        if (i11 == 4) {
            return new C11915U1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
