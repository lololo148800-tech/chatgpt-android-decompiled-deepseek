package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C10946Z {

    /* JADX INFO: renamed from: a */
    public final AbstractC10987u f33009a;

    /* JADX INFO: renamed from: b */
    public final String f33010b;

    /* JADX INFO: renamed from: c */
    public final Object[] f33011c;

    /* JADX INFO: renamed from: d */
    public final int f33012d;

    public C10946Z(AbstractC10987u abstractC10987u, String str, Object[] objArr) {
        this.f33009a = abstractC10987u;
        this.f33010b = str;
        this.f33011c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f33012d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f33012d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC10947a m11517a() {
        return this.f33009a;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m11518b() {
        return this.f33011c;
    }

    /* JADX INFO: renamed from: c */
    public final String m11519c() {
        return this.f33010b;
    }

    /* JADX INFO: renamed from: d */
    public final int m11520d() {
        return (this.f33012d & 1) == 1 ? 1 : 2;
    }
}
