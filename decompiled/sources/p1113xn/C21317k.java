package p1113xn;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC16544l;
import p200Hm.C3508g;
import p466T0.C7186m;
import p523V9.AbstractC7981R5;
import p530Vi.AbstractC8301I;
import p909nm.C17662G;

/* JADX INFO: renamed from: xn.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C21317k {

    /* JADX INFO: renamed from: a */
    public final Matcher f67753a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f67754b;

    /* JADX INFO: renamed from: c */
    public final C7186m f67755c;

    /* JADX INFO: renamed from: d */
    public C17662G f67756d;

    public C21317k(Matcher matcher, CharSequence input) {
        AbstractC16544l.m18094g(input, "input");
        this.f67753a = matcher;
        this.f67754b = input;
        this.f67755c = new C7186m(this, 1);
    }

    /* JADX INFO: renamed from: a */
    public final List m21657a() {
        if (this.f67756d == null) {
            this.f67756d = new C17662G(this);
        }
        C17662G c17662g = this.f67756d;
        AbstractC16544l.m18091d(c17662g);
        return c17662g;
    }

    /* JADX INFO: renamed from: b */
    public final C3508g m21658b() {
        Matcher matcher = this.f67753a;
        return AbstractC8301I.m8929t(matcher.start(), matcher.end());
    }

    /* JADX INFO: renamed from: c */
    public final String m21659c() {
        String strGroup = this.f67753a.group();
        AbstractC16544l.m18093f(strGroup, "group(...)");
        return strGroup;
    }

    /* JADX INFO: renamed from: d */
    public final C21317k m21660d() {
        Matcher matcher = this.f67753a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f67754b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        AbstractC16544l.m18093f(matcher2, "matcher(...)");
        return AbstractC7981R5.m8287d(matcher2, iEnd, charSequence);
    }
}
