package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o */
/* JADX INFO: loaded from: classes.dex */
public final class C10975o {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f33074c = 0;

    /* JADX INFO: renamed from: a */
    public final C10952c0 f33075a = new C10952c0(16);

    /* JADX INFO: renamed from: b */
    public boolean f33076b;

    static {
        new C10975o(0);
    }

    public C10975o() {
    }

    /* JADX INFO: renamed from: b */
    public static void m11672b(C10963i c10963i, EnumC10998z0 enumC10998z0, int i10, Object obj) throws C10961h {
        if (enumC10998z0 == EnumC10998z0.f33102p0) {
            c10963i.m11654e0(i10, 3);
            ((AbstractC10947a) obj).mo11523c(c10963i);
            c10963i.m11654e0(i10, 4);
            return;
        }
        c10963i.m11654e0(i10, enumC10998z0.f33106Z);
        switch (enumC10998z0.ordinal()) {
            case 0:
                c10963i.m11649Z(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c10963i.m11647X(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c10963i.m11658i0(((Long) obj).longValue());
                break;
            case 3:
                c10963i.m11658i0(((Long) obj).longValue());
                break;
            case 4:
                c10963i.m11651b0(((Integer) obj).intValue());
                break;
            case 5:
                c10963i.m11649Z(((Long) obj).longValue());
                break;
            case 6:
                c10963i.m11647X(((Integer) obj).intValue());
                break;
            case 7:
                c10963i.m11641R(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C10957f)) {
                    c10963i.m11653d0((String) obj);
                } else {
                    c10963i.m11645V((C10957f) obj);
                }
                break;
            case 9:
                ((AbstractC10947a) obj).mo11523c(c10963i);
                break;
            case 10:
                AbstractC10947a abstractC10947a = (AbstractC10947a) obj;
                c10963i.getClass();
                c10963i.m11656g0(abstractC10947a.mo11521a());
                abstractC10947a.mo11523c(c10963i);
                break;
            case 11:
                if (!(obj instanceof C10957f)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c10963i.m11656g0(length);
                    c10963i.m11642S(bArr, 0, length);
                } else {
                    c10963i.m11645V((C10957f) obj);
                }
                break;
            case 12:
                c10963i.m11656g0(((Integer) obj).intValue());
                break;
            case 13:
                c10963i.m11651b0(((Integer) obj).intValue());
                break;
            case 14:
                c10963i.m11647X(((Integer) obj).intValue());
                break;
            case 15:
                c10963i.m11649Z(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c10963i.m11656g0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c10963i.m11658i0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11673a() {
        if (this.f33076b) {
            return;
        }
        C10952c0 c10952c0 = this.f33075a;
        if (!c10952c0.f33024p0) {
            if (c10952c0.f33022Z.size() > 0) {
                c10952c0.m11575c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c10952c0.m11576d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c10952c0.f33024p0) {
            c10952c0.f33023o0 = c10952c0.f33023o0.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(c10952c0.f33023o0);
            c10952c0.f33026r0 = c10952c0.f33026r0.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(c10952c0.f33026r0);
            c10952c0.f33024p0 = true;
        }
        this.f33076b = true;
    }

    public final Object clone() {
        C10975o c10975o = new C10975o();
        C10952c0 c10952c0 = this.f33075a;
        if (c10952c0.f33022Z.size() > 0) {
            Map.Entry entryM11575c = c10952c0.m11575c(0);
            if (entryM11575c.getKey() != null) {
                throw new ClassCastException();
            }
            entryM11575c.getValue();
            throw null;
        }
        Iterator it = c10952c0.m11576d().iterator();
        if (!it.hasNext()) {
            return c10975o;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10975o) {
            return this.f33075a.equals(((C10975o) obj).f33075a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33075a.hashCode();
    }

    public C10975o(int i10) {
        m11673a();
        m11673a();
    }
}
