package p1044uj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC7877E4;
import p960q9.C18658l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 uj.a[], still in use, count: 1, list:
  (r2v3 uj.a[]) from 0x0021: INVOKE (r2v3 uj.a[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:34)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: uj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20324a implements Parcelable {
    UPLOAD("upload"),
    MANUAL("manual");

    public static final Parcelable.Creator<EnumC20324a> CREATOR;

    /* JADX INFO: renamed from: Y */
    public final String f64262Y;

    static {
        AbstractC7877E4.m8156j(enumC20324aArr);
        CREATOR = new C18658l(13);
    }

    public EnumC20324a(String str) {
        super(str, i);
        this.f64262Y = str;
    }

    public static EnumC20324a valueOf(String str) {
        return (EnumC20324a) Enum.valueOf(EnumC20324a.class, str);
    }

    public static EnumC20324a[] values() {
        return (EnumC20324a[]) f64261p0.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(name());
    }
}
