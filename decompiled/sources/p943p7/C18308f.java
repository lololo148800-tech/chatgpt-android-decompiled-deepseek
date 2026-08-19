package p943p7;

import p633a.AbstractC10441a;

/* JADX INFO: renamed from: p7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C18308f extends AbstractC10441a {

    /* JADX INFO: renamed from: b */
    public static final C18308f f58434b = new C18308f(0);

    /* JADX INFO: renamed from: c */
    public static final C18308f f58435c = new C18308f(1);

    /* JADX INFO: renamed from: d */
    public static final C18308f f58436d = new C18308f(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58437a;

    public /* synthetic */ C18308f(int i10) {
        this.f58437a = i10;
    }

    public final String toString() {
        switch (this.f58437a) {
            case 0:
                return "invalid";
            case 1:
                return "obsolete";
            default:
                return "purged";
        }
    }
}
