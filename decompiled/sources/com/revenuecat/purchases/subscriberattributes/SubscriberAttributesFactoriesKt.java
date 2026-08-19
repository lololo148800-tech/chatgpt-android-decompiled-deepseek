package com.revenuecat.purchases.subscriberattributes;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import org.json.JSONException;
import org.json.JSONObject;
import p049Bm.InterfaceC1436k;
import p1091wn.AbstractC21031l;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000$\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0006*\u00020\u0004H\u0000\u001a0\u0010\u0007\u001a&\u0012\b\u0012\u00060\u0002j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00060\u0001j\u0002`\t*\u00020\u0004H\u0000¨\u0006\n"}, m18067d2 = {"buildLegacySubscriberAttributes", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lorg/json/JSONObject;", "buildSubscriberAttributesMap", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "buildSubscriberAttributesMapPerUser", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubscriberAttributesFactoriesKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt$buildSubscriberAttributesMap$1 */
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"", "kotlin.jvm.PlatformType", "attributeKey", "Lmm/l;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "invoke", "(Ljava/lang/String;)Lmm/l;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127561 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ JSONObject $this_buildSubscriberAttributesMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127561(JSONObject jSONObject) {
            super(1);
            this.$this_buildSubscriberAttributesMap = jSONObject;
        }

        @Override // p049Bm.InterfaceC1436k
        public final C17309l invoke(String str) throws JSONException {
            Object obj = this.$this_buildSubscriberAttributesMap.get(str);
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return new C17309l(str, new SubscriberAttribute((JSONObject) obj));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt$buildSubscriberAttributesMapPerUser$1 */
    @Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18067d2 = {"", "kotlin.jvm.PlatformType", "userId", "Lmm/l;", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "invoke", "(Ljava/lang/String;)Lmm/l;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127571 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ JSONObject $attributesJSONObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127571(JSONObject jSONObject) {
            super(1);
            this.$attributesJSONObject = jSONObject;
        }

        @Override // p049Bm.InterfaceC1436k
        public final C17309l invoke(String str) throws JSONException {
            Object obj = this.$attributesJSONObject.get(str);
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return new C17309l(str, SubscriberAttributesFactoriesKt.buildSubscriberAttributesMap((JSONObject) obj));
        }
    }

    public static final Map<String, SubscriberAttribute> buildLegacySubscriberAttributes(JSONObject jSONObject) throws JSONException {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        JSONObject attributesJSONObject = jSONObject.getJSONObject("attributes");
        AbstractC16544l.m18093f(attributesJSONObject, "attributesJSONObject");
        return buildSubscriberAttributesMap(attributesJSONObject);
    }

    public static final Map<String, SubscriberAttribute> buildSubscriberAttributesMap(JSONObject jSONObject) {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC16544l.m18093f(itKeys, "this.keys()");
        return AbstractC17659D.m19255q(AbstractC21031l.m21495s(AbstractC21031l.m21483g(itKeys), new C127561(jSONObject)));
    }

    public static final Map<String, Map<String, SubscriberAttribute>> buildSubscriberAttributesMapPerUser(JSONObject jSONObject) throws JSONException {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        Iterator<String> itKeys = jSONObject2.keys();
        AbstractC16544l.m18093f(itKeys, "attributesJSONObject.keys()");
        return AbstractC17659D.m19255q(AbstractC21031l.m21495s(AbstractC21031l.m21483g(itKeys), new C127571(jSONObject2)));
    }
}
