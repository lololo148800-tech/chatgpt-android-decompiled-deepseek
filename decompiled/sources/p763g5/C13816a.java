package p763g5;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0237c1;
import p229J0.C4171z3;
import p593Y8.C9683j;
import p749fd.C13628m;
import p801i5.C14932d;

/* JADX INFO: renamed from: g5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13816a extends AbstractC0237c1 {

    /* JADX INFO: renamed from: Z */
    public final int f43811Z;

    /* JADX INFO: renamed from: o0 */
    public final C9683j f43812o0;

    /* JADX INFO: renamed from: p0 */
    public final String f43813p0;

    /* JADX INFO: renamed from: q0 */
    public final String f43814q0;

    /* JADX INFO: renamed from: r0 */
    public final String f43815r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13816a(String[] strArr, C9683j driver, C4171z3 c4171z3) {
        super(c4171z3);
        AbstractC16544l.m18094g(driver, "driver");
        this.f43811Z = -41583637;
        this.f43812o0 = driver;
        this.f43813p0 = "Conversation.sq";
        this.f43814q0 = "getAll";
        this.f43815r0 = "SELECT conversation\nFROM DBConversation";
    }

    @Override // p003A1.AbstractC0237c1
    /* JADX INFO: renamed from: a */
    public final C14932d mo783a(C13628m c13628m) {
        return this.f43812o0.m10279m(Integer.valueOf(this.f43811Z), this.f43815r0, c13628m, 0, null);
    }

    public final String toString() {
        return this.f43813p0 + ':' + this.f43814q0;
    }
}
