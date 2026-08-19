package bj;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: bj.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C11449N extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34614a;

    public /* synthetic */ C11449N(int i10) {
        this.f34614a = i10;
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) {
        switch (this.f34614a) {
            case 0:
                return abstractC11477x.mo12820x();
            case 1:
                return Boolean.valueOf(abstractC11477x.mo12806S0());
            case 2:
                return Byte.valueOf((byte) AbstractC11452Q.m12857g(abstractC11477x, "a byte", -128, 255));
            case 3:
                String strMo12820x = abstractC11477x.mo12820x();
                if (strMo12820x.length() <= 1) {
                    return Character.valueOf(strMo12820x.charAt(0));
                }
                throw new C11473t(AbstractC10763a.m11055m("Expected a char but was ", AbstractC10763a.m11047e('\"', Separators.DOUBLE_QUOTE, strMo12820x), " at path ", abstractC11477x.m12867E()));
            case 4:
                return Double.valueOf(abstractC11477x.mo12803O());
            case 5:
                float fMo12803O = (float) abstractC11477x.mo12803O();
                if (abstractC11477x.f34701q0 || !Float.isInfinite(fMo12803O)) {
                    return Float.valueOf(fMo12803O);
                }
                throw new C11473t("JSON forbids NaN and infinities: " + fMo12803O + " at path " + abstractC11477x.m12867E());
            case 6:
                return Integer.valueOf(abstractC11477x.mo12816g0());
            case 7:
                return Long.valueOf(abstractC11477x.mo12801E0());
            default:
                return Short.valueOf((short) AbstractC11452Q.m12857g(abstractC11477x, "a short", -32768, 32767));
        }
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        switch (this.f34614a) {
            case 0:
                abstractC11440E.mo12828V0((String) obj);
                break;
            case 1:
                abstractC11440E.mo12830W0(((Boolean) obj).booleanValue());
                break;
            case 2:
                abstractC11440E.mo12824H0(((Byte) obj).intValue() & 255);
                break;
            case 3:
                abstractC11440E.mo12828V0(((Character) obj).toString());
                break;
            case 4:
                abstractC11440E.mo12822C0(((Double) obj).doubleValue());
                break;
            case 5:
                Float f10 = (Float) obj;
                f10.getClass();
                abstractC11440E.mo12826N0(f10);
                break;
            case 6:
                abstractC11440E.mo12824H0(((Integer) obj).intValue());
                break;
            case 7:
                abstractC11440E.mo12824H0(((Long) obj).longValue());
                break;
            default:
                abstractC11440E.mo12824H0(((Short) obj).intValue());
                break;
        }
    }

    public final String toString() {
        switch (this.f34614a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
