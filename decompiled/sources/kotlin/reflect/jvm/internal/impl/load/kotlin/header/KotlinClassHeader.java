package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p523V9.AbstractC7877E4;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinClassHeader {

    /* JADX INFO: renamed from: a */
    public final Kind f52090a;

    /* JADX INFO: renamed from: b */
    public final JvmMetadataVersion f52091b;

    /* JADX INFO: renamed from: c */
    public final String[] f52092c;

    /* JADX INFO: renamed from: d */
    public final String[] f52093d;

    /* JADX INFO: renamed from: e */
    public final String[] f52094e;

    /* JADX INFO: renamed from: f */
    public final String f52095f;

    /* JADX INFO: renamed from: g */
    public final int f52096g;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[], still in use, count: 1, list:
      (r11v2 kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[]) from 0x004e: INVOKE (r11v2 kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:80)
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
    public static final class Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);

        public static final Companion Companion;

        /* JADX INFO: renamed from: Z */
        public static final LinkedHashMap f52097Z;

        /* JADX INFO: renamed from: Y */
        public final int f52099Y;

        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public final Kind getById(int i10) {
                Kind kind = (Kind) Kind.f52097Z.get(Integer.valueOf(i10));
                return kind == null ? Kind.UNKNOWN : kind;
            }
        }

        public Kind(int i10) {
            super(str, i);
            this.f52099Y = i10;
        }

        public static final Kind getById(int i10) {
            return Companion.getById(i10);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f52098o0.clone();
        }

        static {
            AbstractC7877E4.m8156j(new Kind[]{r0, r1, r3, r5, r7, r9});
            Companion = new Companion(null);
            Kind[] kindArrValues = values();
            int iM19257b = AbstractC17660E.m19257b(kindArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b < 16 ? 16 : iM19257b);
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.f52099Y), kind);
            }
            f52097Z = linkedHashMap;
        }
    }

    public KotlinClassHeader(Kind kind, JvmMetadataVersion metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(metadataVersion, "metadataVersion");
        this.f52090a = kind;
        this.f52091b = metadataVersion;
        this.f52092c = strArr;
        this.f52093d = strArr2;
        this.f52094e = strArr3;
        this.f52095f = str;
        this.f52096g = i10;
    }

    public final String[] getData() {
        return this.f52092c;
    }

    public final String[] getIncompatibleData() {
        return this.f52093d;
    }

    public final Kind getKind() {
        return this.f52090a;
    }

    public final JvmMetadataVersion getMetadataVersion() {
        return this.f52091b;
    }

    public final String getMultifileClassName() {
        if (this.f52090a == Kind.MULTIFILE_CLASS_PART) {
            return this.f52095f;
        }
        return null;
    }

    public final List<String> getMultifilePartNames() {
        String[] strArr = this.f52090a == Kind.MULTIFILE_CLASS ? this.f52092c : null;
        List<String> listM19296c = strArr != null ? AbstractC17678l.m19296c(strArr) : null;
        return listM19296c == null ? C17689w.f56480Y : listM19296c;
    }

    public final String[] getStrings() {
        return this.f52094e;
    }

    public final boolean isPreRelease() {
        return (this.f52096g & 2) != 0;
    }

    public final boolean isUnstableJvmIrBinary() {
        int i10 = this.f52096g;
        return (i10 & 16) != 0 && (i10 & 32) == 0;
    }

    public String toString() {
        return this.f52090a + " version=" + this.f52091b;
    }
}
