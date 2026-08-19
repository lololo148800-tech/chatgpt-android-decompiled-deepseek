package p1143z4;

import android.net.Uri;
import io.sentry.C15524y1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21329w;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: z4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C21784n extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69101Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21786p f69102Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21784n(C21786p c21786p, int i10) {
        super(0);
        this.f69101Y = i10;
        this.f69102Z = c21786p;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        List list;
        switch (this.f69101Y) {
            case 0:
                C17309l c17309l = (C17309l) this.f69102Z.f69114h.getValue();
                return (c17309l == null || (list = (List) c17309l.f55136Y) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f69102Z.f69107a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb2 = new StringBuilder();
                AbstractC16544l.m18091d(fragment);
                C21786p.m22273a(fragment, arrayList, sb2);
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "fragRegex.toString()");
                return new C17309l(arrayList, string);
            case 2:
                String str2 = (String) this.f69102Z.f69116j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                C17309l c17309l2 = (C17309l) this.f69102Z.f69114h.getValue();
                if (c17309l2 != null) {
                    return (String) c17309l2.f55137Z;
                }
                return null;
            case 4:
                String str3 = this.f69102Z.f69107a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                this.f69102Z.getClass();
                return null;
            case 6:
                String str4 = this.f69102Z.f69109c;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            default:
                C21786p c21786p = this.f69102Z;
                c21786p.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) c21786p.f69111e.getValue()).booleanValue()) {
                    String str5 = c21786p.f69107a;
                    Uri uri = Uri.parse(str5);
                    for (String paramName : uri.getQueryParameterNames()) {
                        StringBuilder sb3 = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(paramName);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(AbstractC0010F.m20d("Query parameter ", paramName, " must only be present once in ", str5, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String queryParam = (String) AbstractC17680n.m19343S(queryParameters);
                        if (queryParam == null) {
                            c21786p.f69113g = true;
                            queryParam = paramName;
                        }
                        Matcher matcher = C21786p.f69106n.matcher(queryParam);
                        C21783m c21783m = new C21783m();
                        int iEnd = 0;
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            AbstractC16544l.m18092e(strGroup, "null cannot be cast to non-null type kotlin.String");
                            c21783m.f69100b.add(strGroup);
                            AbstractC16544l.m18093f(queryParam, "queryParam");
                            String strSubstring = queryParam.substring(iEnd, matcher.start());
                            AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb3.append(Pattern.quote(strSubstring));
                            sb3.append("(.+?)?");
                            iEnd = matcher.end();
                        }
                        if (iEnd < queryParam.length()) {
                            String strSubstring2 = queryParam.substring(iEnd);
                            AbstractC16544l.m18093f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                            sb3.append(Pattern.quote(strSubstring2));
                        }
                        String string2 = sb3.toString();
                        AbstractC16544l.m18093f(string2, "argRegex.toString()");
                        c21783m.f69099a = AbstractC21329w.m21731r(string2, C15524y1.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q");
                        AbstractC16544l.m18093f(paramName, "paramName");
                        linkedHashMap.put(paramName, c21783m);
                    }
                }
                return linkedHashMap;
        }
    }
}
