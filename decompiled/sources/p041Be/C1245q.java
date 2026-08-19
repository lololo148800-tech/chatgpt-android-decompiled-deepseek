package p041Be;

import ao.AbstractC11137K;
import bo.AbstractC11523k;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16644c;
import kotlinx.serialization.json.JsonNull;
import p1113xn.AbstractC21322p;
import p1126yd.C21411D;
import p1126yd.C21421I;
import p1126yd.C21427L;
import p1126yd.C21433O;
import p1126yd.C21440S;
import p1126yd.C21463c0;
import p1126yd.C21471f0;
import p1126yd.C21476i;
import p1126yd.C21482l;
import p1126yd.C21483l0;
import p1126yd.InterfaceC21409C;
import p929oi.AbstractC18201b;

/* JADX INFO: renamed from: Be.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C1245q extends AbstractC11137K {

    /* JADX INFO: renamed from: d */
    public static final C1245q f3280d = new C1245q(AbstractC16526C.f51263a.mo5693b(InterfaceC21409C.class));

    /* JADX INFO: renamed from: e */
    public static InterfaceC21409C m1970e(String str) {
        AbstractC16544l.m18094g(str, "str");
        try {
            return (InterfaceC21409C) AbstractC18201b.f58034a.m12903b(str, f3280d);
        } catch (IllegalArgumentException e10) {
            AbstractC16645d abstractC16645d = AbstractC1220M.f3218a;
            String input = AbstractC21322p.m21711s0(str).toString();
            Pattern patternCompile = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
            AbstractC16544l.m18093f(patternCompile, "compile(...)");
            AbstractC16544l.m18094g(input, "input");
            return patternCompile.matcher(input).matches() ? null : new C21411D(e10);
        }
    }

    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: c */
    public final KSerializer mo1967c(AbstractC16643b element) {
        AbstractC16544l.m18094g(element, "element");
        if (!(element instanceof C16644c)) {
            throw new IllegalArgumentException(("Invalid JSON element: " + element).toString());
        }
        if (AbstractC11523k.m12917j(element).containsKey("moderation_response")) {
            return C21440S.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(AbstractC11523k.m12917j(element).get("type"), AbstractC1220M.f3218a)) {
            return C21427L.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(AbstractC11523k.m12917j(element).get("type"), AbstractC1220M.f3219b)) {
            return C21463c0.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(AbstractC11523k.m12917j(element).get("type"), AbstractC1220M.f3222e)) {
            return C21476i.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(AbstractC11523k.m12917j(element).get("type"), AbstractC1220M.f3223f)) {
            return C21482l.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(AbstractC11523k.m12917j(element).get("type"), AbstractC1220M.f3220c)) {
            return C21471f0.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(AbstractC11523k.m12917j(element).get("type"), AbstractC1220M.f3221d)) {
            return C21483l0.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(AbstractC11523k.m12917j(element).get("type"), AbstractC11523k.m12910c("url_moderation"))) {
            return C21483l0.Companion.serializer();
        }
        return (AbstractC11523k.m12917j(element).get("error") == null || (AbstractC11523k.m12917j(element).get("error") instanceof JsonNull)) ? C21433O.Companion.serializer() : C21421I.Companion.serializer();
    }
}
