package com.withpersona.sdk2.inquiry.network.dto;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p000.AbstractC21571z;
import p000.C18254p;
import p000.InterfaceC20083u;
import p049Bm.InterfaceC1426a;
import p078Co.InterfaceC1759a;
import p078Co.InterfaceC1760b;
import p104Do.C2221b;
import p130Eo.C2618c;
import p130Eo.C2619d;
import p130Eo.C2620e;
import p130Eo.C2622g;
import p154Fo.C2946a;
import p177Go.C3107a;
import p227Io.C3790a;
import p252Jo.C4487b;
import p276Ko.C4826b;
import p325Mo.C5558b;
import p343Nk.C5817a;
import p343Nk.C5818b;
import p347No.C5937b;
import p390Po.C6540a;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lu;", "invoke", "()Lu;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
public final class JsonLogicBooleanKt$jsonLogicEngine$2 extends AbstractC16546n implements InterfaceC1426a {
    public static final JsonLogicBooleanKt$jsonLogicEngine$2 INSTANCE = new JsonLogicBooleanKt$jsonLogicEngine$2();

    public JsonLogicBooleanKt$jsonLogicEngine$2() {
        super(0);
    }

    @Override // p049Bm.InterfaceC1426a
    public final InterfaceC20083u invoke() {
        LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(new C17309l("var", C3107a.f9349d), new C17309l("missing_some", C3107a.f9348c), new C17309l("missing", C3107a.f9347b), new C17309l(Separators.GREATER_THAN, C5937b.f19318b), new C17309l(">=", C5937b.f19319c), new C17309l(Separators.LESS_THAN, C5937b.f19320d), new C17309l("<=", C5937b.f19321e), new C17309l("min", C5558b.f18018e), new C17309l("max", C5558b.f18017d), new C17309l("+", C5558b.f18015b), new C17309l("-", C5558b.f18021h), new C17309l(Separators.STAR, C5558b.f18020g), new C17309l(Separators.SLASH, C5558b.f18016c), new C17309l(Separators.PERCENT, C5558b.f18019f), new C17309l("==", C4487b.f14641b), new C17309l("!=", C4487b.f14642c), new C17309l("===", C4826b.f15719c), new C17309l("!==", C4826b.f15718b), new C17309l("!", C3790a.f11456e), new C17309l("!!", C3790a.f11454c), new C17309l("and", C3790a.f11453b), new C17309l("or", C3790a.f11457f), new C17309l("if", C3790a.f11455d), new C17309l("cat", C6540a.f21167b), new C17309l("substr", C6540a.f21168c), new C17309l("merge", C2620e.f8109a), new C17309l("in", C2221b.f6803b));
        LinkedHashMap linkedHashMapM19246h2 = AbstractC17659D.m19246h(new C17309l("map", C2619d.f8108a), new C17309l("filter", C2618c.f8107a), new C17309l("reduce", C2622g.f8110a), new C17309l("all", C2946a.f8815b), new C17309l("none", C2946a.f8816c), new C17309l("some", C2946a.f8817d));
        LinkedHashMap operations = AbstractC21571z.f68303a;
        AbstractC16544l.m18094g(operations, "operations");
        for (Map.Entry entry : operations.entrySet()) {
            String operationName = (String) entry.getKey();
            InterfaceC1760b operation = (InterfaceC1760b) entry.getValue();
            AbstractC16544l.m18094g(operationName, "operationName");
            AbstractC16544l.m18094g(operation, "operation");
            if (!linkedHashMapM19246h2.containsKey(operationName) && !linkedHashMapM19246h.containsKey(operationName)) {
                linkedHashMapM19246h.put(operationName, operation);
            }
        }
        LinkedHashMap operations2 = AbstractC21571z.f68304b;
        AbstractC16544l.m18094g(operations2, "operations");
        for (Map.Entry entry2 : operations2.entrySet()) {
            String operationName2 = (String) entry2.getKey();
            InterfaceC1759a operation2 = (InterfaceC1759a) entry2.getValue();
            AbstractC16544l.m18094g(operationName2, "operationName");
            AbstractC16544l.m18094g(operation2, "operation");
            if (!linkedHashMapM19246h2.containsKey(operationName2) && !linkedHashMapM19246h.containsKey(operationName2)) {
                linkedHashMapM19246h2.put(operationName2, operation2);
            }
        }
        return new C18254p(new C5817a(new C5818b(linkedHashMapM19246h, linkedHashMapM19246h2)));
    }
}
