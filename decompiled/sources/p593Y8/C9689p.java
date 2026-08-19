package p593Y8;

import java.util.Set;
import p522V8.C7836c;
import p522V8.InterfaceC7838e;
import p522V8.InterfaceC7839f;

/* JADX INFO: renamed from: Y8.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9689p implements InterfaceC7839f {

    /* JADX INFO: renamed from: a */
    public final Set f29203a;

    /* JADX INFO: renamed from: b */
    public final C9682i f29204b;

    /* JADX INFO: renamed from: c */
    public final C9691r f29205c;

    public C9689p(Set set, C9682i c9682i, C9691r c9691r) {
        this.f29203a = set;
        this.f29204b = c9682i;
        this.f29205c = c9691r;
    }

    /* JADX INFO: renamed from: a */
    public final C9690q m10280a(String str, C7836c c7836c, InterfaceC7838e interfaceC7838e) {
        Set set = this.f29203a;
        if (set.contains(c7836c)) {
            return new C9690q(this.f29204b, str, c7836c, interfaceC7838e, this.f29205c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c7836c, set));
    }
}
