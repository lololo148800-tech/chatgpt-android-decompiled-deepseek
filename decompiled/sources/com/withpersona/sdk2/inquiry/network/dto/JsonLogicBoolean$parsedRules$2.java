package com.withpersona.sdk2.inquiry.network.dto;

import bj.C11447L;
import dj.AbstractC13178c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p185H6.C3246b;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m18067d2 = {"<anonymous>", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "invoke"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class JsonLogicBoolean$parsedRules$2 extends AbstractC16546n implements InterfaceC1426a {
    final /* synthetic */ JsonLogicBoolean this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonLogicBoolean$parsedRules$2(JsonLogicBoolean jsonLogicBoolean) {
        super(0);
        this.this$0 = jsonLogicBoolean;
    }

    @Override // p049Bm.InterfaceC1426a
    public final ParsedRules invoke() {
        Object objFromJson = new C11447L(new C3246b()).m12849a(Object.class, AbstractC13178c.f41820a).nullSafe().lenient().fromJson(this.this$0.getRule());
        if (!(objFromJson instanceof Map)) {
            if (objFromJson instanceof Boolean) {
                return new ParsedRules.PrimitiveRule(objFromJson);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) objFromJson).entrySet()) {
            Object key = entry.getKey();
            C17309l c17309l = key instanceof String ? new C17309l(key, entry.getValue()) : null;
            if (c17309l != null) {
                arrayList.add(c17309l);
            }
        }
        return new ParsedRules.ComplexRules(AbstractC17659D.m19253o(arrayList));
    }
}
