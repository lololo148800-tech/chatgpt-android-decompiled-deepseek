package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11969j1 extends AbstractC11908S0 {
    private static final Map zzb = new ConcurrentHashMap();
    protected C11892M1 zzc;
    private int zzd;

    public AbstractC11969j1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = C11892M1.f36161f;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC11969j1 m13474h(Class cls) {
        Map map = zzb;
        AbstractC11969j1 abstractC11969j1 = (AbstractC11969j1) map.get(cls);
        if (abstractC11969j1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC11969j1 = (AbstractC11969j1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC11969j1 == null) {
            abstractC11969j1 = (AbstractC11969j1) ((AbstractC11969j1) AbstractC11906R1.m13331h(cls)).mo13306d(6);
            if (abstractC11969j1 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC11969j1);
        }
        return abstractC11969j1;
    }

    /* JADX INFO: renamed from: i */
    public static Object m13475i(Method method, AbstractC11908S0 abstractC11908S0, Object... objArr) {
        try {
            return method.invoke(abstractC11908S0, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m13476k(Class cls, AbstractC11969j1 abstractC11969j1) {
        abstractC11969j1.m13482j();
        zzb.put(cls, abstractC11969j1);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m13477m(AbstractC11969j1 abstractC11969j1, boolean z6) {
        byte bByteValue = ((Byte) abstractC11969j1.mo13306d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo13239c = C11871F1.f36125c.m13262a(abstractC11969j1.getClass()).mo13239c(abstractC11969j1);
        if (z6) {
            abstractC11969j1.mo13306d(2);
        }
        return zMo13239c;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11908S0
    /* JADX INFO: renamed from: a */
    public final int mo13345a(InterfaceC11880I1 interfaceC11880I1) {
        if (m13478c()) {
            int iMo13240d = interfaceC11880I1.mo13240d(this);
            if (iMo13240d >= 0) {
                return iMo13240d;
            }
            throw new IllegalStateException(AbstractC10763a.m11048f(iMo13240d, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iMo13240d2 = interfaceC11880I1.mo13240d(this);
        if (iMo13240d2 < 0) {
            throw new IllegalStateException(AbstractC10763a.m11048f(iMo13240d2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo13240d2;
        return iMo13240d2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13478c() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo13306d(int i10);

    /* JADX INFO: renamed from: e */
    public final int m13479e() {
        int iMo13240d;
        if (m13478c()) {
            iMo13240d = C11871F1.f36125c.m13262a(getClass()).mo13240d(this);
            if (iMo13240d < 0) {
                throw new IllegalStateException(AbstractC10763a.m11048f(iMo13240d, "serialized size must be non-negative, was "));
            }
        } else {
            iMo13240d = this.zzd & Integer.MAX_VALUE;
            if (iMo13240d == Integer.MAX_VALUE) {
                iMo13240d = C11871F1.f36125c.m13262a(getClass()).mo13240d(this);
                if (iMo13240d < 0) {
                    throw new IllegalStateException(AbstractC10763a.m11048f(iMo13240d, "serialized size must be non-negative, was "));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo13240d;
            }
        }
        return iMo13240d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C11871F1.f36125c.m13262a(getClass()).mo13244h(this, (AbstractC11969j1) obj);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC11965i1 m13480f() {
        return (AbstractC11965i1) mo13306d(5);
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC11965i1 m13481g() {
        AbstractC11965i1 abstractC11965i1 = (AbstractC11965i1) mo13306d(5);
        if (!abstractC11965i1.f36277Y.equals(this)) {
            if (!abstractC11965i1.f36278Z.m13478c()) {
                AbstractC11969j1 abstractC11969j1 = (AbstractC11969j1) abstractC11965i1.f36277Y.mo13306d(4);
                C11871F1.f36125c.m13262a(abstractC11969j1.getClass()).mo13241e(abstractC11969j1, abstractC11965i1.f36278Z);
                abstractC11965i1.f36278Z = abstractC11969j1;
            }
            AbstractC11969j1 abstractC11969j2 = abstractC11965i1.f36278Z;
            C11871F1.f36125c.m13262a(abstractC11969j2.getClass()).mo13241e(abstractC11969j2, this);
        }
        return abstractC11965i1;
    }

    public final int hashCode() {
        if (m13478c()) {
            return C11871F1.f36125c.m13262a(getClass()).mo13242f(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iMo13242f = C11871F1.f36125c.m13262a(getClass()).mo13242f(this);
        this.zza = iMo13242f;
        return iMo13242f;
    }

    /* JADX INFO: renamed from: j */
    public final void m13482j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: l */
    public final void m13483l() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC11855A1.f36096a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        AbstractC11855A1.m13219c(this, sb2, 0);
        return sb2.toString();
    }
}
