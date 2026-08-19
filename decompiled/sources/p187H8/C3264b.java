package p187H8;

import p164G8.C3008b;

/* JADX INFO: renamed from: H8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3264b extends AbstractC3263a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f9937b;

    public /* synthetic */ C3264b(int i10) {
        this.f9937b = i10;
    }

    @Override // p187H8.AbstractC3263a
    /* JADX INFO: renamed from: a */
    public final boolean mo4147a(C3008b c3008b, Object obj) {
        switch (this.f9937b) {
            case 0:
                if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
                    if ((obj instanceof String) && Boolean.parseBoolean((String) obj)) {
                        c3008b.m3843f(-1);
                        break;
                    }
                } else {
                    c3008b.m3843f(-1);
                    break;
                }
                break;
            case 1:
                if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
                    if ((obj instanceof String) && Boolean.parseBoolean((String) obj)) {
                        c3008b.m3843f(2);
                        break;
                    }
                } else {
                    c3008b.m3843f(2);
                    break;
                }
                break;
            default:
                c3008b.m3844g(String.valueOf(obj));
                break;
        }
        return false;
    }
}
