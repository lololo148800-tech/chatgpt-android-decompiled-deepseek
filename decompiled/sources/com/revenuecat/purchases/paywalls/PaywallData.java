package com.revenuecat.purchases.paywalls;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import ao.AbstractC11153a0;
import ao.AbstractC11171j0;
import ao.C11131E;
import ao.C11158d;
import ao.C11181o0;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.utils.LocaleExtensionsKt;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import mm.InterfaceC17300c;
import p003A1.AbstractC0168G;
import p1053v3.p1054lN.IGDwkYw;
import p1071w0.AbstractC20734X;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.bQBnquXS;
import p631Zn.InterfaceC10429b;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0004\\[]^B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u009f\u0001\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0001\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\"\b\u0001\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J)\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nHÀ\u0003¢\u0006\u0004\b)\u0010*J(\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\nHÀ\u0003¢\u0006\u0004\b,\u0010*J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u008c\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n2 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\"J\u0010\u00104\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b4\u0010(J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J5\u00109\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eH\u0002¢\u0006\u0004\b9\u0010\u001bJ(\u0010@\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=HÇ\u0001¢\u0006\u0004\b@\u0010AR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010B\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010$R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010H\u0012\u0004\bJ\u0010E\u001a\u0004\bI\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bL\u0010(R,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\f\u0010M\u0012\u0004\bO\u0010E\u001a\u0004\bN\u0010*R8\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010M\u0012\u0004\bQ\u0010E\u001a\u0004\bP\u0010*R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010R\u0012\u0004\bT\u0010E\u001a\u0004\bS\u0010/R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010B\u0012\u0004\bV\u0010E\u001a\u0004\bU\u0010\"R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u00198F¢\u0006\u0006\u001a\u0004\bW\u0010XR)\u0010Z\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u00198F¢\u0006\u0006\u001a\u0004\bY\u0010X¨\u0006_"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData;", "", "", "templateName", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "config", "Ljava/net/URL;", "assetBaseURL", "", "revision", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "localization", "localizationByTier", "", "zeroDecimalPlaceCountries", "defaultLocale", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Lao/j0;)V", "Ljava/util/Locale;", "locales", "Lmm/l;", "localizedConfiguration", "(Ljava/util/List;)Lmm/l;", "requiredLocale", "configForLocale", "(Ljava/util/Locale;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "tieredConfigForLocale", "(Ljava/util/Locale;)Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "component3", "()Ljava/net/URL;", "component4", "()I", "component5$purchases_customEntitlementComputationRelease", "()Ljava/util/Map;", "component5", "component6$purchases_customEntitlementComputationRelease", "component6", "component7", "()Ljava/util/List;", "component8", "copy", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "tieredConfigForLocales", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTemplateName", "getTemplateName$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "getConfig", "Ljava/net/URL;", "getAssetBaseURL", "getAssetBaseURL$annotations", TokenNames.f32012I, "getRevision", "Ljava/util/Map;", "getLocalization$purchases_customEntitlementComputationRelease", "getLocalization$purchases_customEntitlementComputationRelease$annotations", "getLocalizationByTier$purchases_customEntitlementComputationRelease", "getLocalizationByTier$purchases_customEntitlementComputationRelease$annotations", "Ljava/util/List;", "getZeroDecimalPlaceCountries", "getZeroDecimalPlaceCountries$annotations", "getDefaultLocale", "getDefaultLocale$annotations", "getLocalizedConfiguration", "()Lmm/l;", "getTieredLocalizedConfiguration", "tieredLocalizedConfiguration", "Companion", "$serializer", "Configuration", "LocalizedConfiguration", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class PaywallData {
    private static final KSerializer[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final URL assetBaseURL;
    private final Configuration config;
    private final String defaultLocale;
    private final Map<String, LocalizedConfiguration> localization;
    private final Map<String, Map<String, LocalizedConfiguration>> localizationByTier;
    private final int revision;
    private final String templateName;
    private final List<String> zeroDecimalPlaceCountries;

    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PaywallData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C11181o0 c11181o0 = C11181o0.f33827a;
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, new C11131E(c11181o0, paywallData$LocalizedConfiguration$$serializer, 1), new C11131E(c11181o0, new C11131E(c11181o0, paywallData$LocalizedConfiguration$$serializer, 1), 1), null, null};
    }

    @InterfaceC17300c
    public /* synthetic */ PaywallData(int i10, String str, Configuration configuration, @InterfaceC8975g(with = URLSerializer.class) URL url, int i11, Map map, Map map2, @InterfaceC8975g(with = GoogleListSerializer.class) List list, String str2, AbstractC11171j0 abstractC11171j0) {
        if (23 != (i10 & 23)) {
            AbstractC11153a0.m12389l(i10, 23, PaywallData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.templateName = str;
        this.config = configuration;
        this.assetBaseURL = url;
        if ((i10 & 8) == 0) {
            this.revision = 0;
        } else {
            this.revision = i11;
        }
        this.localization = map;
        if ((i10 & 32) == 0) {
            this.localizationByTier = C17690x.f56481Y;
        } else {
            this.localizationByTier = map2;
        }
        if ((i10 & 64) == 0) {
            this.zeroDecimalPlaceCountries = C17689w.f56480Y;
        } else {
            this.zeroDecimalPlaceCountries = list;
        }
        if ((i10 & 128) == 0) {
            this.defaultLocale = null;
        } else {
            this.defaultLocale = str2;
        }
    }

    @InterfaceC8975g(with = URLSerializer.class)
    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    public static /* synthetic */ void getDefaultLocale$annotations() {
    }

    /* JADX INFO: renamed from: getLocalization$purchases_customEntitlementComputationRelease$annotations */
    public static /* synthetic */ void m14495x6b982da() {
    }

    /* JADX INFO: renamed from: getLocalizationByTier$purchases_customEntitlementComputationRelease$annotations */
    public static /* synthetic */ void m14496x40dc2d53() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    @InterfaceC8975g(with = GoogleListSerializer.class)
    public static /* synthetic */ void getZeroDecimalPlaceCountries$annotations() {
    }

    private final C17309l tieredConfigForLocales(List<Locale> locales) {
        Object next;
        Iterator<Locale> it = locales.iterator();
        while (it.hasNext()) {
            Locale localeConvertToCorrectlyFormattedLocale = LocaleExtensionsKt.convertToCorrectlyFormattedLocale(it.next());
            Map<String, LocalizedConfiguration> mapTieredConfigForLocale = tieredConfigForLocale(localeConvertToCorrectlyFormattedLocale);
            if (mapTieredConfigForLocale != null) {
                return new C17309l(localeConvertToCorrectlyFormattedLocale, mapTieredConfigForLocale);
            }
        }
        String str = this.defaultLocale;
        if (str != null) {
            Iterator<T> it2 = this.localizationByTier.entrySet().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!AbstractC16544l.m18089b(LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey()), LocaleExtensionsKt.toLocale(str)));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return new C17309l(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) AbstractC17680n.m19340P(this.localizationByTier.entrySet());
        return new C17309l(LocaleExtensionsKt.toLocale((String) entry2.getKey()), entry2.getValue());
    }

    public static final /* synthetic */ void write$Self(PaywallData self, InterfaceC10429b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.mo5584r(serialDesc, 0, self.templateName);
        output.mo5575i(serialDesc, 1, PaywallData$Configuration$$serializer.INSTANCE, self.config);
        output.mo5575i(serialDesc, 2, URLSerializer.INSTANCE, self.assetBaseURL);
        if (output.mo5565F(serialDesc) || self.revision != 0) {
            output.mo5579m(3, self.revision, serialDesc);
        }
        output.mo5575i(serialDesc, 4, kSerializerArr[4], self.localization);
        if (output.mo5565F(serialDesc) || !AbstractC16544l.m18089b(self.localizationByTier, C17690x.f56481Y)) {
            output.mo5575i(serialDesc, 5, kSerializerArr[5], self.localizationByTier);
        }
        if (output.mo5565F(serialDesc) || !AbstractC16544l.m18089b(self.zeroDecimalPlaceCountries, C17689w.f56480Y)) {
            output.mo5575i(serialDesc, 6, GoogleListSerializer.INSTANCE, self.zeroDecimalPlaceCountries);
        }
        if (!output.mo5565F(serialDesc) && self.defaultLocale == null) {
            return;
        }
        output.mo5585s(serialDesc, 7, C11181o0.f33827a, self.defaultLocale);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTemplateName() {
        return this.templateName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Configuration getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRevision() {
        return this.revision;
    }

    public final Map<String, LocalizedConfiguration> component5$purchases_customEntitlementComputationRelease() {
        return this.localization;
    }

    public final Map<String, Map<String, LocalizedConfiguration>> component6$purchases_customEntitlementComputationRelease() {
        return this.localizationByTier;
    }

    public final List<String> component7() {
        return this.zeroDecimalPlaceCountries;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDefaultLocale() {
        return this.defaultLocale;
    }

    public final LocalizedConfiguration configForLocale(Locale requiredLocale) {
        Object next;
        AbstractC16544l.m18094g(requiredLocale, "requiredLocale");
        LocalizedConfiguration localizedConfiguration = this.localization.get(requiredLocale.toString());
        if (localizedConfiguration != null) {
            return localizedConfiguration;
        }
        Iterator<T> it = this.localization.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!LocaleExtensionsKt.sharedLanguageCodeWith(requiredLocale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey())));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (LocalizedConfiguration) entry.getValue();
        }
        return null;
    }

    public final PaywallData copy(String templateName, Configuration config, URL assetBaseURL, int revision, Map<String, LocalizedConfiguration> localization, Map<String, ? extends Map<String, LocalizedConfiguration>> localizationByTier, List<String> zeroDecimalPlaceCountries, String defaultLocale) {
        AbstractC16544l.m18094g(templateName, "templateName");
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(assetBaseURL, "assetBaseURL");
        AbstractC16544l.m18094g(localization, "localization");
        AbstractC16544l.m18094g(localizationByTier, "localizationByTier");
        AbstractC16544l.m18094g(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
        return new PaywallData(templateName, config, assetBaseURL, revision, localization, localizationByTier, zeroDecimalPlaceCountries, defaultLocale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallData)) {
            return false;
        }
        PaywallData paywallData = (PaywallData) other;
        return AbstractC16544l.m18089b(this.templateName, paywallData.templateName) && AbstractC16544l.m18089b(this.config, paywallData.config) && AbstractC16544l.m18089b(this.assetBaseURL, paywallData.assetBaseURL) && this.revision == paywallData.revision && AbstractC16544l.m18089b(this.localization, paywallData.localization) && AbstractC16544l.m18089b(this.localizationByTier, paywallData.localizationByTier) && AbstractC16544l.m18089b(this.zeroDecimalPlaceCountries, paywallData.zeroDecimalPlaceCountries) && AbstractC16544l.m18089b(this.defaultLocale, paywallData.defaultLocale);
    }

    public final URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final Configuration getConfig() {
        return this.config;
    }

    public final String getDefaultLocale() {
        return this.defaultLocale;
    }

    public final Map<String, LocalizedConfiguration> getLocalization$purchases_customEntitlementComputationRelease() {
        return this.localization;
    }

    /* JADX INFO: renamed from: getLocalizationByTier$purchases_customEntitlementComputationRelease */
    public final Map<String, Map<String, LocalizedConfiguration>> m14497xcacfd553() {
        return this.localizationByTier;
    }

    public final C17309l getLocalizedConfiguration() {
        return localizedConfiguration(LocaleExtensionsKt.getDefaultLocales());
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final C17309l getTieredLocalizedConfiguration() {
        return tieredConfigForLocales(LocaleExtensionsKt.getDefaultLocales());
    }

    public final List<String> getZeroDecimalPlaceCountries() {
        return this.zeroDecimalPlaceCountries;
    }

    public int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.zeroDecimalPlaceCountries, AbstractC20734X.m21250u(AbstractC20734X.m21250u((((this.assetBaseURL.hashCode() + ((this.config.hashCode() + (this.templateName.hashCode() * 31)) * 31)) * 31) + this.revision) * 31, 31, this.localization), 31, this.localizationByTier), 31);
        String str = this.defaultLocale;
        return iM15858x + (str == null ? 0 : str.hashCode());
    }

    public final C17309l localizedConfiguration(List<Locale> locales) {
        Object next;
        AbstractC16544l.m18094g(locales, "locales");
        Iterator<Locale> it = locales.iterator();
        while (it.hasNext()) {
            Locale localeConvertToCorrectlyFormattedLocale = LocaleExtensionsKt.convertToCorrectlyFormattedLocale(it.next());
            LocalizedConfiguration localizedConfigurationConfigForLocale = configForLocale(localeConvertToCorrectlyFormattedLocale);
            if (localizedConfigurationConfigForLocale != null) {
                return new C17309l(localeConvertToCorrectlyFormattedLocale, localizedConfigurationConfigForLocale);
            }
        }
        String str = this.defaultLocale;
        if (str != null) {
            Iterator<T> it2 = this.localization.entrySet().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!AbstractC16544l.m18089b(LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey()), LocaleExtensionsKt.toLocale(str)));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return new C17309l(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) AbstractC17680n.m19340P(this.localization.entrySet());
        return new C17309l(LocaleExtensionsKt.toLocale((String) entry2.getKey()), entry2.getValue());
    }

    public final Map<String, LocalizedConfiguration> tieredConfigForLocale(Locale requiredLocale) {
        Object next;
        AbstractC16544l.m18094g(requiredLocale, "requiredLocale");
        Map<String, LocalizedConfiguration> map = this.localizationByTier.get(requiredLocale.toString());
        if (map != null) {
            return map;
        }
        Iterator<T> it = this.localizationByTier.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!LocaleExtensionsKt.sharedLanguageCodeWith(requiredLocale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey())));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Map) entry.getValue();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaywallData(templateName=");
        sb2.append(this.templateName);
        sb2.append(", config=");
        sb2.append(this.config);
        sb2.append(", assetBaseURL=");
        sb2.append(this.assetBaseURL);
        sb2.append(", revision=");
        sb2.append(this.revision);
        sb2.append(", localization=");
        sb2.append(this.localization);
        sb2.append(", localizationByTier=");
        sb2.append(this.localizationByTier);
        sb2.append(", zeroDecimalPlaceCountries=");
        sb2.append(this.zeroDecimalPlaceCountries);
        sb2.append(", defaultLocale=");
        return AbstractC9306j0.m9892k(sb2, this.defaultLocale, ')');
    }

    @Metadata(m18066d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0006hijgklB½\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018B¡\u0001\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u001aBÓ\u0001\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0001\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0017\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b'\u0010%J\u001e\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b1\u00102J\u001e\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b3\u0010*J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010!J\u0012\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u0010#JÈ\u0001\u00106\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b8\u0010#J\u0010\u00109\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=J(\u0010D\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AHÇ\u0001¢\u0006\u0004\bD\u0010ER&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010F\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010J\u0012\u0004\bL\u0010I\u001a\u0004\bK\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010M\u0012\u0004\bO\u0010I\u001a\u0004\bN\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010M\u0012\u0004\bQ\u0010I\u001a\u0004\bP\u0010%R.\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010R\u0012\u0004\bT\u0010I\u001a\u0004\bS\u0010*R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010U\u0012\u0004\bW\u0010I\u001a\u0004\bV\u0010,R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010U\u0012\u0004\bY\u0010I\u001a\u0004\bX\u0010,R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010Z\u0012\u0004\b\\\u0010I\u001a\u0004\b[\u0010/R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010Z\u0012\u0004\b^\u0010I\u001a\u0004\b]\u0010/R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010_\u001a\u0004\b`\u00102R.\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010R\u0012\u0004\bb\u0010I\u001a\u0004\ba\u0010*R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bc\u0010!R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010J\u0012\u0004\be\u0010I\u001a\u0004\bd\u0010#R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bf\u0010%¨\u0006m"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "", "", "", "packageIds", "defaultPackage", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "imagesWebp", "legacyImages", "", "imagesByTier", "", "blurredBackgroundImage", "displayRestorePurchases", "Ljava/net/URL;", "termsOfServiceURL", "privacyURL", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "colors", "colorsByTier", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "tiers", "defaultTier", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "images", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;ZZLjava/net/URL;Ljava/net/URL;)V", "", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Lao/j0;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "component3", "component4$purchases_customEntitlementComputationRelease", "component4", "component5", "()Ljava/util/Map;", "component6", "()Z", "component7", "component8", "()Ljava/net/URL;", "component9", "component10", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "component11", "component12", "component13", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getPackageIds", "getPackageIds$annotations", "()V", "Ljava/lang/String;", "getDefaultPackage", "getDefaultPackage$annotations", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "getImagesWebp$purchases_customEntitlementComputationRelease", "getImagesWebp$purchases_customEntitlementComputationRelease$annotations", "getLegacyImages$purchases_customEntitlementComputationRelease", "getLegacyImages$purchases_customEntitlementComputationRelease$annotations", "Ljava/util/Map;", "getImagesByTier", "getImagesByTier$annotations", "Z", "getBlurredBackgroundImage", "getBlurredBackgroundImage$annotations", "getDisplayRestorePurchases", "getDisplayRestorePurchases$annotations", "Ljava/net/URL;", "getTermsOfServiceURL", "getTermsOfServiceURL$annotations", "getPrivacyURL", "getPrivacyURL$annotations", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "getColors", "getColorsByTier", "getColorsByTier$annotations", "getTiers", "getDefaultTier", "getDefaultTier$annotations", "getImages", "Companion", "$serializer", "ColorInformation", "Colors", "Images", "Tier", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC8975g
    public static final /* data */ class Configuration {
        private static final KSerializer[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean blurredBackgroundImage;
        private final ColorInformation colors;
        private final Map<String, ColorInformation> colorsByTier;
        private final String defaultPackage;
        private final String defaultTier;
        private final boolean displayRestorePurchases;
        private final Map<String, Images> imagesByTier;
        private final Images imagesWebp;
        private final Images legacyImages;
        private final List<String> packageIds;
        private final URL privacyURL;
        private final URL termsOfServiceURL;
        private final List<Tier> tiers;

        @Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006'"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)V", "", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lao/j0;)V", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "component2", "copy", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "getLight", "getDark", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC8975g
        public static final /* data */ class ColorInformation {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Colors dark;
            private final Colors light;

            @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer serializer() {
                    return PaywallData$Configuration$ColorInformation$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC17300c
            public /* synthetic */ ColorInformation(int i10, Colors colors, Colors colors2, AbstractC11171j0 abstractC11171j0) {
                if (1 != (i10 & 1)) {
                    AbstractC11153a0.m12389l(i10, 1, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.light = colors;
                if ((i10 & 2) == 0) {
                    this.dark = null;
                } else {
                    this.dark = colors2;
                }
            }

            public static /* synthetic */ ColorInformation copy$default(ColorInformation colorInformation, Colors colors, Colors colors2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    colors = colorInformation.light;
                }
                if ((i10 & 2) != 0) {
                    colors2 = colorInformation.dark;
                }
                return colorInformation.copy(colors, colors2);
            }

            public static final /* synthetic */ void write$Self(ColorInformation self, InterfaceC10429b output, SerialDescriptor serialDesc) {
                PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
                output.mo5575i(serialDesc, 0, paywallData$Configuration$Colors$$serializer, self.light);
                if (!output.mo5565F(serialDesc) && self.dark == null) {
                    return;
                }
                output.mo5585s(serialDesc, 1, paywallData$Configuration$Colors$$serializer, self.dark);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Colors getLight() {
                return this.light;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Colors getDark() {
                return this.dark;
            }

            public final ColorInformation copy(Colors light, Colors dark) {
                AbstractC16544l.m18094g(light, "light");
                return new ColorInformation(light, dark);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) other;
                return AbstractC16544l.m18089b(this.light, colorInformation.light) && AbstractC16544l.m18089b(this.dark, colorInformation.dark);
            }

            public final Colors getDark() {
                return this.dark;
            }

            public final Colors getLight() {
                return this.light;
            }

            public int hashCode() {
                int iHashCode = this.light.hashCode() * 31;
                Colors colors = this.dark;
                return iHashCode + (colors == null ? 0 : colors.hashCode());
            }

            public String toString() {
                return "ColorInformation(light=" + this.light + ", dark=" + this.dark + ')';
            }

            public ColorInformation(Colors light, Colors colors) {
                AbstractC16544l.m18094g(light, "light");
                this.light = light;
                this.dark = colors;
            }

            public /* synthetic */ ColorInformation(Colors colors, Colors colors2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(colors, (i10 & 2) != 0 ? null : colors2);
            }
        }

        @Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013BÏ\u0001\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ¼\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J(\u0010:\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207HÇ\u0001¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010<\u0012\u0004\bA\u0010?\u001a\u0004\b@\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010<\u0012\u0004\bC\u0010?\u001a\u0004\bB\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010<\u0012\u0004\bE\u0010?\u001a\u0004\bD\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010<\u0012\u0004\bG\u0010?\u001a\u0004\bF\u0010\u001aR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\bI\u0010?\u001a\u0004\bH\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\bK\u0010?\u001a\u0004\bJ\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010<\u0012\u0004\bM\u0010?\u001a\u0004\bL\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\bO\u0010?\u001a\u0004\bN\u0010\u001aR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010<\u0012\u0004\bQ\u0010?\u001a\u0004\bP\u0010\u001aR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\bS\u0010?\u001a\u0004\bR\u0010\u001aR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010<\u0012\u0004\bU\u0010?\u001a\u0004\bT\u0010\u001aR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010<\u0012\u0004\bW\u0010?\u001a\u0004\bV\u0010\u001aR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010<\u0012\u0004\bY\u0010?\u001a\u0004\bX\u0010\u001aR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010<\u0012\u0004\b[\u0010?\u001a\u0004\bZ\u0010\u001a¨\u0006^"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "background", "text1", "text2", "text3", "callToActionBackground", "callToActionForeground", "callToActionSecondaryBackground", "accent1", "accent2", "accent3", "closeButton", "tierControlBackground", "tierControlForeground", "tierControlSelectedBackground", "tierControlSelectedForeground", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)V", "", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lao/j0;)V", "component1", "()Lcom/revenuecat/purchases/paywalls/PaywallColor;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "getBackground", "getBackground$annotations", "()V", "getText1", "getText1$annotations", "getText2", "getText2$annotations", "getText3", "getText3$annotations", "getCallToActionBackground", "getCallToActionBackground$annotations", "getCallToActionForeground", "getCallToActionForeground$annotations", "getCallToActionSecondaryBackground", "getCallToActionSecondaryBackground$annotations", "getAccent1", "getAccent1$annotations", "getAccent2", "getAccent2$annotations", "getAccent3", "getAccent3$annotations", "getCloseButton", "getCloseButton$annotations", "getTierControlBackground", "getTierControlBackground$annotations", "getTierControlForeground", "getTierControlForeground$annotations", "getTierControlSelectedBackground", "getTierControlSelectedBackground$annotations", "getTierControlSelectedForeground", "getTierControlSelectedForeground$annotations", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC8975g
        public static final /* data */ class Colors {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final PaywallColor accent1;
            private final PaywallColor accent2;
            private final PaywallColor accent3;
            private final PaywallColor background;
            private final PaywallColor callToActionBackground;
            private final PaywallColor callToActionForeground;
            private final PaywallColor callToActionSecondaryBackground;
            private final PaywallColor closeButton;
            private final PaywallColor text1;
            private final PaywallColor text2;
            private final PaywallColor text3;
            private final PaywallColor tierControlBackground;
            private final PaywallColor tierControlForeground;
            private final PaywallColor tierControlSelectedBackground;
            private final PaywallColor tierControlSelectedForeground;

            @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer serializer() {
                    return PaywallData$Configuration$Colors$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC17300c
            public /* synthetic */ Colors(int i10, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor2, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor3, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor4, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor5, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor6, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor7, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor8, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor9, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor10, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor11, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor12, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor13, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor14, @InterfaceC8975g(with = PaywallColor.Serializer.class) PaywallColor paywallColor15, AbstractC11171j0 abstractC11171j0) {
                if (51 != (i10 & 51)) {
                    AbstractC11153a0.m12389l(i10, 51, PaywallData$Configuration$Colors$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.background = paywallColor;
                this.text1 = paywallColor2;
                if ((i10 & 4) == 0) {
                    this.text2 = null;
                } else {
                    this.text2 = paywallColor3;
                }
                if ((i10 & 8) == 0) {
                    this.text3 = null;
                } else {
                    this.text3 = paywallColor4;
                }
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                if ((i10 & 64) == 0) {
                    this.callToActionSecondaryBackground = null;
                } else {
                    this.callToActionSecondaryBackground = paywallColor7;
                }
                if ((i10 & 128) == 0) {
                    this.accent1 = null;
                } else {
                    this.accent1 = paywallColor8;
                }
                if ((i10 & 256) == 0) {
                    this.accent2 = null;
                } else {
                    this.accent2 = paywallColor9;
                }
                if ((i10 & 512) == 0) {
                    this.accent3 = null;
                } else {
                    this.accent3 = paywallColor10;
                }
                if ((i10 & 1024) == 0) {
                    this.closeButton = null;
                } else {
                    this.closeButton = paywallColor11;
                }
                if ((i10 & 2048) == 0) {
                    this.tierControlBackground = null;
                } else {
                    this.tierControlBackground = paywallColor12;
                }
                if ((i10 & 4096) == 0) {
                    this.tierControlForeground = null;
                } else {
                    this.tierControlForeground = paywallColor13;
                }
                if ((i10 & 8192) == 0) {
                    this.tierControlSelectedBackground = null;
                } else {
                    this.tierControlSelectedBackground = paywallColor14;
                }
                if ((i10 & 16384) == 0) {
                    this.tierControlSelectedForeground = null;
                } else {
                    this.tierControlSelectedForeground = paywallColor15;
                }
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent1$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent2$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent3$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionBackground$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionForeground$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionSecondaryBackground$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCloseButton$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText1$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText2$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText3$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlBackground$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlForeground$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlSelectedBackground$annotations() {
            }

            @InterfaceC8975g(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlSelectedForeground$annotations() {
            }

            public static final /* synthetic */ void write$Self(Colors self, InterfaceC10429b output, SerialDescriptor serialDesc) {
                PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
                output.mo5575i(serialDesc, 0, serializer, self.background);
                output.mo5575i(serialDesc, 1, serializer, self.text1);
                if (output.mo5565F(serialDesc) || self.text2 != null) {
                    output.mo5585s(serialDesc, 2, serializer, self.text2);
                }
                if (output.mo5565F(serialDesc) || self.text3 != null) {
                    output.mo5585s(serialDesc, 3, serializer, self.text3);
                }
                output.mo5575i(serialDesc, 4, serializer, self.callToActionBackground);
                output.mo5575i(serialDesc, 5, serializer, self.callToActionForeground);
                if (output.mo5565F(serialDesc) || self.callToActionSecondaryBackground != null) {
                    output.mo5585s(serialDesc, 6, serializer, self.callToActionSecondaryBackground);
                }
                if (output.mo5565F(serialDesc) || self.accent1 != null) {
                    output.mo5585s(serialDesc, 7, serializer, self.accent1);
                }
                if (output.mo5565F(serialDesc) || self.accent2 != null) {
                    output.mo5585s(serialDesc, 8, serializer, self.accent2);
                }
                if (output.mo5565F(serialDesc) || self.accent3 != null) {
                    output.mo5585s(serialDesc, 9, serializer, self.accent3);
                }
                if (output.mo5565F(serialDesc) || self.closeButton != null) {
                    output.mo5585s(serialDesc, 10, serializer, self.closeButton);
                }
                if (output.mo5565F(serialDesc) || self.tierControlBackground != null) {
                    output.mo5585s(serialDesc, 11, serializer, self.tierControlBackground);
                }
                if (output.mo5565F(serialDesc) || self.tierControlForeground != null) {
                    output.mo5585s(serialDesc, 12, serializer, self.tierControlForeground);
                }
                if (output.mo5565F(serialDesc) || self.tierControlSelectedBackground != null) {
                    output.mo5585s(serialDesc, 13, serializer, self.tierControlSelectedBackground);
                }
                if (!output.mo5565F(serialDesc) && self.tierControlSelectedForeground == null) {
                    return;
                }
                output.mo5585s(serialDesc, 14, serializer, self.tierControlSelectedForeground);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final PaywallColor getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: component10, reason: from getter */
            public final PaywallColor getAccent3() {
                return this.accent3;
            }

            /* JADX INFO: renamed from: component11, reason: from getter */
            public final PaywallColor getCloseButton() {
                return this.closeButton;
            }

            /* JADX INFO: renamed from: component12, reason: from getter */
            public final PaywallColor getTierControlBackground() {
                return this.tierControlBackground;
            }

            /* JADX INFO: renamed from: component13, reason: from getter */
            public final PaywallColor getTierControlForeground() {
                return this.tierControlForeground;
            }

            /* JADX INFO: renamed from: component14, reason: from getter */
            public final PaywallColor getTierControlSelectedBackground() {
                return this.tierControlSelectedBackground;
            }

            /* JADX INFO: renamed from: component15, reason: from getter */
            public final PaywallColor getTierControlSelectedForeground() {
                return this.tierControlSelectedForeground;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final PaywallColor getText1() {
                return this.text1;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final PaywallColor getText2() {
                return this.text2;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final PaywallColor getText3() {
                return this.text3;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final PaywallColor getCallToActionBackground() {
                return this.callToActionBackground;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final PaywallColor getCallToActionForeground() {
                return this.callToActionForeground;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final PaywallColor getCallToActionSecondaryBackground() {
                return this.callToActionSecondaryBackground;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final PaywallColor getAccent1() {
                return this.accent1;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final PaywallColor getAccent2() {
                return this.accent2;
            }

            public final Colors copy(PaywallColor background, PaywallColor text1, PaywallColor text2, PaywallColor text3, PaywallColor callToActionBackground, PaywallColor callToActionForeground, PaywallColor callToActionSecondaryBackground, PaywallColor accent1, PaywallColor accent2, PaywallColor accent3, PaywallColor closeButton, PaywallColor tierControlBackground, PaywallColor tierControlForeground, PaywallColor tierControlSelectedBackground, PaywallColor tierControlSelectedForeground) {
                AbstractC16544l.m18094g(background, "background");
                AbstractC16544l.m18094g(text1, "text1");
                AbstractC16544l.m18094g(callToActionBackground, "callToActionBackground");
                AbstractC16544l.m18094g(callToActionForeground, "callToActionForeground");
                return new Colors(background, text1, text2, text3, callToActionBackground, callToActionForeground, callToActionSecondaryBackground, accent1, accent2, accent3, closeButton, tierControlBackground, tierControlForeground, tierControlSelectedBackground, tierControlSelectedForeground);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Colors)) {
                    return false;
                }
                Colors colors = (Colors) other;
                return AbstractC16544l.m18089b(this.background, colors.background) && AbstractC16544l.m18089b(this.text1, colors.text1) && AbstractC16544l.m18089b(this.text2, colors.text2) && AbstractC16544l.m18089b(this.text3, colors.text3) && AbstractC16544l.m18089b(this.callToActionBackground, colors.callToActionBackground) && AbstractC16544l.m18089b(this.callToActionForeground, colors.callToActionForeground) && AbstractC16544l.m18089b(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && AbstractC16544l.m18089b(this.accent1, colors.accent1) && AbstractC16544l.m18089b(this.accent2, colors.accent2) && AbstractC16544l.m18089b(this.accent3, colors.accent3) && AbstractC16544l.m18089b(this.closeButton, colors.closeButton) && AbstractC16544l.m18089b(this.tierControlBackground, colors.tierControlBackground) && AbstractC16544l.m18089b(this.tierControlForeground, colors.tierControlForeground) && AbstractC16544l.m18089b(this.tierControlSelectedBackground, colors.tierControlSelectedBackground) && AbstractC16544l.m18089b(this.tierControlSelectedForeground, colors.tierControlSelectedForeground);
            }

            public final PaywallColor getAccent1() {
                return this.accent1;
            }

            public final PaywallColor getAccent2() {
                return this.accent2;
            }

            public final PaywallColor getAccent3() {
                return this.accent3;
            }

            public final PaywallColor getBackground() {
                return this.background;
            }

            public final PaywallColor getCallToActionBackground() {
                return this.callToActionBackground;
            }

            public final PaywallColor getCallToActionForeground() {
                return this.callToActionForeground;
            }

            public final PaywallColor getCallToActionSecondaryBackground() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor getCloseButton() {
                return this.closeButton;
            }

            public final PaywallColor getText1() {
                return this.text1;
            }

            public final PaywallColor getText2() {
                return this.text2;
            }

            public final PaywallColor getText3() {
                return this.text3;
            }

            public final PaywallColor getTierControlBackground() {
                return this.tierControlBackground;
            }

            public final PaywallColor getTierControlForeground() {
                return this.tierControlForeground;
            }

            public final PaywallColor getTierControlSelectedBackground() {
                return this.tierControlSelectedBackground;
            }

            public final PaywallColor getTierControlSelectedForeground() {
                return this.tierControlSelectedForeground;
            }

            public int hashCode() {
                int iHashCode = (this.text1.hashCode() + (this.background.hashCode() * 31)) * 31;
                PaywallColor paywallColor = this.text2;
                int iHashCode2 = (iHashCode + (paywallColor == null ? 0 : paywallColor.hashCode())) * 31;
                PaywallColor paywallColor2 = this.text3;
                int iHashCode3 = (this.callToActionForeground.hashCode() + ((this.callToActionBackground.hashCode() + ((iHashCode2 + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31)) * 31)) * 31;
                PaywallColor paywallColor3 = this.callToActionSecondaryBackground;
                int iHashCode4 = (iHashCode3 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.accent1;
                int iHashCode5 = (iHashCode4 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.accent2;
                int iHashCode6 = (iHashCode5 + (paywallColor5 == null ? 0 : paywallColor5.hashCode())) * 31;
                PaywallColor paywallColor6 = this.accent3;
                int iHashCode7 = (iHashCode6 + (paywallColor6 == null ? 0 : paywallColor6.hashCode())) * 31;
                PaywallColor paywallColor7 = this.closeButton;
                int iHashCode8 = (iHashCode7 + (paywallColor7 == null ? 0 : paywallColor7.hashCode())) * 31;
                PaywallColor paywallColor8 = this.tierControlBackground;
                int iHashCode9 = (iHashCode8 + (paywallColor8 == null ? 0 : paywallColor8.hashCode())) * 31;
                PaywallColor paywallColor9 = this.tierControlForeground;
                int iHashCode10 = (iHashCode9 + (paywallColor9 == null ? 0 : paywallColor9.hashCode())) * 31;
                PaywallColor paywallColor10 = this.tierControlSelectedBackground;
                int iHashCode11 = (iHashCode10 + (paywallColor10 == null ? 0 : paywallColor10.hashCode())) * 31;
                PaywallColor paywallColor11 = this.tierControlSelectedForeground;
                return iHashCode11 + (paywallColor11 != null ? paywallColor11.hashCode() : 0);
            }

            public String toString() {
                return "Colors(background=" + this.background + ", text1=" + this.text1 + ", text2=" + this.text2 + ", text3=" + this.text3 + ", callToActionBackground=" + this.callToActionBackground + ", callToActionForeground=" + this.callToActionForeground + ", callToActionSecondaryBackground=" + this.callToActionSecondaryBackground + ", accent1=" + this.accent1 + ", accent2=" + this.accent2 + ", accent3=" + this.accent3 + ", closeButton=" + this.closeButton + ", tierControlBackground=" + this.tierControlBackground + ", tierControlForeground=" + this.tierControlForeground + ", tierControlSelectedBackground=" + this.tierControlSelectedBackground + ", tierControlSelectedForeground=" + this.tierControlSelectedForeground + ')';
            }

            public Colors(PaywallColor background, PaywallColor text1, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor callToActionBackground, PaywallColor callToActionForeground, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11) {
                AbstractC16544l.m18094g(background, "background");
                AbstractC16544l.m18094g(text1, "text1");
                AbstractC16544l.m18094g(callToActionBackground, "callToActionBackground");
                AbstractC16544l.m18094g(callToActionForeground, "callToActionForeground");
                this.background = background;
                this.text1 = text1;
                this.text2 = paywallColor;
                this.text3 = paywallColor2;
                this.callToActionBackground = callToActionBackground;
                this.callToActionForeground = callToActionForeground;
                this.callToActionSecondaryBackground = paywallColor3;
                this.accent1 = paywallColor4;
                this.accent2 = paywallColor5;
                this.accent3 = paywallColor6;
                this.closeButton = paywallColor7;
                this.tierControlBackground = paywallColor8;
                this.tierControlForeground = paywallColor9;
                this.tierControlSelectedBackground = paywallColor10;
                this.tierControlSelectedForeground = paywallColor11;
            }

            public /* synthetic */ Colors(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(paywallColor, paywallColor2, (i10 & 4) != 0 ? null : paywallColor3, (i10 & 8) != 0 ? null : paywallColor4, paywallColor5, paywallColor6, (i10 & 64) != 0 ? null : paywallColor7, (i10 & 128) != 0 ? null : paywallColor8, (i10 & 256) != 0 ? null : paywallColor9, (i10 & 512) != 0 ? null : paywallColor10, (i10 & 1024) != 0 ? null : paywallColor11, (i10 & 2048) != 0 ? null : paywallColor12, (i10 & 4096) != 0 ? null : paywallColor13, (i10 & 8192) != 0 ? null : paywallColor14, (i10 & 16384) != 0 ? null : paywallColor15);
            }
        }

        @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return PaywallData$Configuration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J4\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u0016R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "", "", "header", "background", ParameterNames.ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lao/j0;)V", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getHeader$annotations", "()V", "getBackground", "getBackground$annotations", "getIcon", "getIcon$annotations", "", "getAll$purchases_customEntitlementComputationRelease", "()Ljava/util/List;", "all", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC8975g
        public static final /* data */ class Images {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String background;
            private final String header;
            private final String icon;

            @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer serializer() {
                    return PaywallData$Configuration$Images$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Images() {
                this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Images copy$default(Images images, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = images.header;
                }
                if ((i10 & 2) != 0) {
                    str2 = images.background;
                }
                if ((i10 & 4) != 0) {
                    str3 = images.icon;
                }
                return images.copy(str, str2, str3);
            }

            @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getHeader$annotations() {
            }

            @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getIcon$annotations() {
            }

            public static final /* synthetic */ void write$Self(Images self, InterfaceC10429b output, SerialDescriptor serialDesc) {
                if (output.mo5565F(serialDesc) || self.header != null) {
                    output.mo5585s(serialDesc, 0, EmptyStringToNullSerializer.INSTANCE, self.header);
                }
                if (output.mo5565F(serialDesc) || self.background != null) {
                    output.mo5585s(serialDesc, 1, EmptyStringToNullSerializer.INSTANCE, self.background);
                }
                if (!output.mo5565F(serialDesc) && self.icon == null) {
                    return;
                }
                output.mo5585s(serialDesc, 2, EmptyStringToNullSerializer.INSTANCE, self.icon);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getHeader() {
                return this.header;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            public final Images copy(String header, String background, String icon) {
                return new Images(header, background, icon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Images)) {
                    return false;
                }
                Images images = (Images) other;
                return AbstractC16544l.m18089b(this.header, images.header) && AbstractC16544l.m18089b(this.background, images.background) && AbstractC16544l.m18089b(this.icon, images.icon);
            }

            public final List<String> getAll$purchases_customEntitlementComputationRelease() {
                return AbstractC17678l.m19315v(new String[]{this.header, this.background, this.icon});
            }

            public final String getBackground() {
                return this.background;
            }

            public final String getHeader() {
                return this.header;
            }

            public final String getIcon() {
                return this.icon;
            }

            public int hashCode() {
                String str = this.header;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.background;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.icon;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @InterfaceC17300c
            public /* synthetic */ Images(int i10, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str2, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str3, AbstractC11171j0 abstractC11171j0) {
                if ((i10 & 1) == 0) {
                    this.header = null;
                } else {
                    this.header = str;
                }
                if ((i10 & 2) == 0) {
                    this.background = null;
                } else {
                    this.background = str2;
                }
                if ((i10 & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = str3;
                }
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Images(header=");
                sb2.append(this.header);
                sb2.append(", background=");
                sb2.append(this.background);
                sb2.append(bQBnquXS.rmJsaGizqrYm);
                return AbstractC9306j0.m9892k(sb2, this.icon, ')');
            }

            public Images(String str, String str2, String str3) {
                this.header = str;
                this.background = str2;
                this.icon = str3;
            }

            public /* synthetic */ Images(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
            }
        }

        @Metadata(m18066d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J4\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0017¨\u0006."}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "", "", ParameterNames.f31999ID, "", "packageIds", "defaultPackageId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lao/j0;)V", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getPackageIds", "getPackageIds$annotations", "()V", "getDefaultPackageId", "getDefaultPackageId$annotations", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC8975g
        public static final /* data */ class Tier {
            private final String defaultPackageId;
            private final String id;
            private final List<String> packageIds;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final KSerializer[] $childSerializers = {null, new C11158d(C11181o0.f33827a, 0), null};

            @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer serializer() {
                    return PaywallData$Configuration$Tier$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC17300c
            public /* synthetic */ Tier(int i10, String str, List list, String str2, AbstractC11171j0 abstractC11171j0) {
                if (7 != (i10 & 7)) {
                    AbstractC11153a0.m12389l(i10, 7, PaywallData$Configuration$Tier$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = str;
                this.packageIds = list;
                this.defaultPackageId = str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Tier copy$default(Tier tier, String str, List list, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = tier.id;
                }
                if ((i10 & 2) != 0) {
                    list = tier.packageIds;
                }
                if ((i10 & 4) != 0) {
                    str2 = tier.defaultPackageId;
                }
                return tier.copy(str, list, str2);
            }

            public static /* synthetic */ void getDefaultPackageId$annotations() {
            }

            public static /* synthetic */ void getPackageIds$annotations() {
            }

            public static final /* synthetic */ void write$Self(Tier self, InterfaceC10429b output, SerialDescriptor serialDesc) {
                KSerializer[] kSerializerArr = $childSerializers;
                output.mo5584r(serialDesc, 0, self.id);
                output.mo5575i(serialDesc, 1, kSerializerArr[1], self.packageIds);
                output.mo5584r(serialDesc, 2, self.defaultPackageId);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final List<String> component2() {
                return this.packageIds;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getDefaultPackageId() {
                return this.defaultPackageId;
            }

            public final Tier copy(String id2, List<String> packageIds, String defaultPackageId) {
                AbstractC16544l.m18094g(id2, "id");
                AbstractC16544l.m18094g(packageIds, "packageIds");
                AbstractC16544l.m18094g(defaultPackageId, "defaultPackageId");
                return new Tier(id2, packageIds, defaultPackageId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Tier)) {
                    return false;
                }
                Tier tier = (Tier) other;
                return AbstractC16544l.m18089b(this.id, tier.id) && AbstractC16544l.m18089b(this.packageIds, tier.packageIds) && AbstractC16544l.m18089b(this.defaultPackageId, tier.defaultPackageId);
            }

            public final String getDefaultPackageId() {
                return this.defaultPackageId;
            }

            public final String getId() {
                return this.id;
            }

            public final List<String> getPackageIds() {
                return this.packageIds;
            }

            public int hashCode() {
                return this.defaultPackageId.hashCode() + AbstractC14376f.m15858x(this.packageIds, this.id.hashCode() * 31, 31);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Tier(id=");
                sb2.append(this.id);
                sb2.append(", packageIds=");
                sb2.append(this.packageIds);
                sb2.append(", defaultPackageId=");
                return AbstractC9306j0.m9892k(sb2, this.defaultPackageId, ')');
            }

            public Tier(String id2, List<String> packageIds, String defaultPackageId) {
                AbstractC16544l.m18094g(id2, "id");
                AbstractC16544l.m18094g(packageIds, "packageIds");
                AbstractC16544l.m18094g(defaultPackageId, "defaultPackageId");
                this.id = id2;
                this.packageIds = packageIds;
                this.defaultPackageId = defaultPackageId;
            }
        }

        static {
            C11181o0 c11181o0 = C11181o0.f33827a;
            $childSerializers = new KSerializer[]{new C11158d(c11181o0, 0), null, null, null, new C11131E(c11181o0, PaywallData$Configuration$Images$$serializer.INSTANCE, 1), null, null, null, null, null, new C11131E(c11181o0, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, 1), new C11158d(PaywallData$Configuration$Tier$$serializer.INSTANCE, 0), null};
        }

        @InterfaceC17300c
        public /* synthetic */ Configuration(int i10, List list, String str, Images images, Images images2, Map map, boolean z6, boolean z10, @InterfaceC8975g(with = OptionalURLSerializer.class) URL url, @InterfaceC8975g(with = OptionalURLSerializer.class) URL url2, ColorInformation colorInformation, Map map2, List list2, String str2, AbstractC11171j0 abstractC11171j0) {
            if (512 != (i10 & 512)) {
                AbstractC11153a0.m12389l(i10, 512, PaywallData$Configuration$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.packageIds = (i10 & 1) == 0 ? C17689w.f56480Y : list;
            if ((i10 & 2) == 0) {
                this.defaultPackage = null;
            } else {
                this.defaultPackage = str;
            }
            if ((i10 & 4) == 0) {
                this.imagesWebp = null;
            } else {
                this.imagesWebp = images;
            }
            if ((i10 & 8) == 0) {
                this.legacyImages = null;
            } else {
                this.legacyImages = images2;
            }
            if ((i10 & 16) == 0) {
                this.imagesByTier = null;
            } else {
                this.imagesByTier = map;
            }
            this.blurredBackgroundImage = (i10 & 32) == 0 ? false : z6;
            this.displayRestorePurchases = (i10 & 64) == 0 ? true : z10;
            if ((i10 & 128) == 0) {
                this.termsOfServiceURL = null;
            } else {
                this.termsOfServiceURL = url;
            }
            if ((i10 & 256) == 0) {
                this.privacyURL = null;
            } else {
                this.privacyURL = url2;
            }
            this.colors = colorInformation;
            if ((i10 & 1024) == 0) {
                this.colorsByTier = null;
            } else {
                this.colorsByTier = map2;
            }
            if ((i10 & 2048) == 0) {
                this.tiers = null;
            } else {
                this.tiers = list2;
            }
            if ((i10 & 4096) == 0) {
                this.defaultTier = null;
            } else {
                this.defaultTier = str2;
            }
        }

        public static /* synthetic */ void getBlurredBackgroundImage$annotations() {
        }

        public static /* synthetic */ void getColorsByTier$annotations() {
        }

        public static /* synthetic */ void getDefaultPackage$annotations() {
        }

        public static /* synthetic */ void getDefaultTier$annotations() {
        }

        public static /* synthetic */ void getDisplayRestorePurchases$annotations() {
        }

        public static /* synthetic */ void getImagesByTier$annotations() {
        }

        /* JADX INFO: renamed from: getImagesWebp$purchases_customEntitlementComputationRelease$annotations */
        public static /* synthetic */ void m14498x638ed435() {
        }

        /* JADX INFO: renamed from: getLegacyImages$purchases_customEntitlementComputationRelease$annotations */
        public static /* synthetic */ void m14499x78f89e2() {
        }

        public static /* synthetic */ void getPackageIds$annotations() {
        }

        @InterfaceC8975g(with = OptionalURLSerializer.class)
        public static /* synthetic */ void getPrivacyURL$annotations() {
        }

        @InterfaceC8975g(with = OptionalURLSerializer.class)
        public static /* synthetic */ void getTermsOfServiceURL$annotations() {
        }

        public static final /* synthetic */ void write$Self(Configuration self, InterfaceC10429b output, SerialDescriptor serialDesc) {
            KSerializer[] kSerializerArr = $childSerializers;
            if (output.mo5565F(serialDesc) || !AbstractC16544l.m18089b(self.packageIds, C17689w.f56480Y)) {
                output.mo5575i(serialDesc, 0, kSerializerArr[0], self.packageIds);
            }
            if (output.mo5565F(serialDesc) || self.defaultPackage != null) {
                output.mo5585s(serialDesc, 1, C11181o0.f33827a, self.defaultPackage);
            }
            if (output.mo5565F(serialDesc) || self.imagesWebp != null) {
                output.mo5585s(serialDesc, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, self.imagesWebp);
            }
            if (output.mo5565F(serialDesc) || self.legacyImages != null) {
                output.mo5585s(serialDesc, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, self.legacyImages);
            }
            if (output.mo5565F(serialDesc) || self.imagesByTier != null) {
                output.mo5585s(serialDesc, 4, kSerializerArr[4], self.imagesByTier);
            }
            if (output.mo5565F(serialDesc) || self.blurredBackgroundImage) {
                output.mo5583q(serialDesc, 5, self.blurredBackgroundImage);
            }
            if (output.mo5565F(serialDesc) || !self.displayRestorePurchases) {
                output.mo5583q(serialDesc, 6, self.displayRestorePurchases);
            }
            if (output.mo5565F(serialDesc) || self.termsOfServiceURL != null) {
                output.mo5585s(serialDesc, 7, OptionalURLSerializer.INSTANCE, self.termsOfServiceURL);
            }
            if (output.mo5565F(serialDesc) || self.privacyURL != null) {
                output.mo5585s(serialDesc, 8, OptionalURLSerializer.INSTANCE, self.privacyURL);
            }
            output.mo5575i(serialDesc, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, self.colors);
            if (output.mo5565F(serialDesc) || self.colorsByTier != null) {
                output.mo5585s(serialDesc, 10, kSerializerArr[10], self.colorsByTier);
            }
            if (output.mo5565F(serialDesc) || self.tiers != null) {
                output.mo5585s(serialDesc, 11, kSerializerArr[11], self.tiers);
            }
            if (!output.mo5565F(serialDesc) && self.defaultTier == null) {
                return;
            }
            output.mo5585s(serialDesc, 12, C11181o0.f33827a, self.defaultTier);
        }

        public final List<String> component1() {
            return this.packageIds;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final ColorInformation getColors() {
            return this.colors;
        }

        public final Map<String, ColorInformation> component11() {
            return this.colorsByTier;
        }

        public final List<Tier> component12() {
            return this.tiers;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getDefaultTier() {
            return this.defaultTier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDefaultPackage() {
            return this.defaultPackage;
        }

        /* JADX INFO: renamed from: component3$purchases_customEntitlementComputationRelease, reason: from getter */
        public final Images getImagesWebp() {
            return this.imagesWebp;
        }

        /* JADX INFO: renamed from: component4$purchases_customEntitlementComputationRelease, reason: from getter */
        public final Images getLegacyImages() {
            return this.legacyImages;
        }

        public final Map<String, Images> component5() {
            return this.imagesByTier;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getBlurredBackgroundImage() {
            return this.blurredBackgroundImage;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getDisplayRestorePurchases() {
            return this.displayRestorePurchases;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final URL getTermsOfServiceURL() {
            return this.termsOfServiceURL;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final URL getPrivacyURL() {
            return this.privacyURL;
        }

        public final Configuration copy(List<String> packageIds, String defaultPackage, Images imagesWebp, Images legacyImages, Map<String, Images> imagesByTier, boolean blurredBackgroundImage, boolean displayRestorePurchases, URL termsOfServiceURL, URL privacyURL, ColorInformation colors, Map<String, ColorInformation> colorsByTier, List<Tier> tiers, String defaultTier) {
            AbstractC16544l.m18094g(packageIds, "packageIds");
            AbstractC16544l.m18094g(colors, "colors");
            return new Configuration(packageIds, defaultPackage, imagesWebp, legacyImages, imagesByTier, blurredBackgroundImage, displayRestorePurchases, termsOfServiceURL, privacyURL, colors, colorsByTier, tiers, defaultTier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return AbstractC16544l.m18089b(this.packageIds, configuration.packageIds) && AbstractC16544l.m18089b(this.defaultPackage, configuration.defaultPackage) && AbstractC16544l.m18089b(this.imagesWebp, configuration.imagesWebp) && AbstractC16544l.m18089b(this.legacyImages, configuration.legacyImages) && AbstractC16544l.m18089b(this.imagesByTier, configuration.imagesByTier) && this.blurredBackgroundImage == configuration.blurredBackgroundImage && this.displayRestorePurchases == configuration.displayRestorePurchases && AbstractC16544l.m18089b(this.termsOfServiceURL, configuration.termsOfServiceURL) && AbstractC16544l.m18089b(this.privacyURL, configuration.privacyURL) && AbstractC16544l.m18089b(this.colors, configuration.colors) && AbstractC16544l.m18089b(this.colorsByTier, configuration.colorsByTier) && AbstractC16544l.m18089b(this.tiers, configuration.tiers) && AbstractC16544l.m18089b(this.defaultTier, configuration.defaultTier);
        }

        public final boolean getBlurredBackgroundImage() {
            return this.blurredBackgroundImage;
        }

        public final ColorInformation getColors() {
            return this.colors;
        }

        public final Map<String, ColorInformation> getColorsByTier() {
            return this.colorsByTier;
        }

        public final String getDefaultPackage() {
            return this.defaultPackage;
        }

        public final String getDefaultTier() {
            return this.defaultTier;
        }

        public final boolean getDisplayRestorePurchases() {
            return this.displayRestorePurchases;
        }

        public final Images getImages() {
            String header;
            String background;
            String icon;
            Images images = this.imagesWebp;
            String icon2 = null;
            if (images == null || (header = images.getHeader()) == null) {
                Images images2 = this.legacyImages;
                header = images2 != null ? images2.getHeader() : null;
            }
            Images images3 = this.imagesWebp;
            if (images3 == null || (background = images3.getBackground()) == null) {
                Images images4 = this.legacyImages;
                background = images4 != null ? images4.getBackground() : null;
            }
            Images images5 = this.imagesWebp;
            if (images5 == null || (icon = images5.getIcon()) == null) {
                Images images6 = this.legacyImages;
                if (images6 != null) {
                    icon2 = images6.getIcon();
                }
            } else {
                icon2 = icon;
            }
            return new Images(header, background, icon2);
        }

        public final Map<String, Images> getImagesByTier() {
            return this.imagesByTier;
        }

        public final Images getImagesWebp$purchases_customEntitlementComputationRelease() {
            return this.imagesWebp;
        }

        public final Images getLegacyImages$purchases_customEntitlementComputationRelease() {
            return this.legacyImages;
        }

        public final List<String> getPackageIds() {
            return this.packageIds;
        }

        public final URL getPrivacyURL() {
            return this.privacyURL;
        }

        public final URL getTermsOfServiceURL() {
            return this.termsOfServiceURL;
        }

        public final List<Tier> getTiers() {
            return this.tiers;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [int] */
        /* JADX WARN: Type inference failed for: r1v13, types: [int] */
        /* JADX WARN: Type inference failed for: r1v32 */
        /* JADX WARN: Type inference failed for: r1v37 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v2 */
        public int hashCode() {
            int iHashCode = this.packageIds.hashCode() * 31;
            String str = this.defaultPackage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Images images = this.imagesWebp;
            int iHashCode3 = (iHashCode2 + (images == null ? 0 : images.hashCode())) * 31;
            Images images2 = this.legacyImages;
            int iHashCode4 = (iHashCode3 + (images2 == null ? 0 : images2.hashCode())) * 31;
            Map<String, Images> map = this.imagesByTier;
            int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            boolean z6 = this.blurredBackgroundImage;
            ?? r6 = z6;
            if (z6) {
                r6 = 1;
            }
            int i10 = (iHashCode5 + r6) * 31;
            boolean z10 = this.displayRestorePurchases;
            int i11 = (i10 + (z10 ? 1 : z10)) * 31;
            URL url = this.termsOfServiceURL;
            int iHashCode6 = (i11 + (url == null ? 0 : url.hashCode())) * 31;
            URL url2 = this.privacyURL;
            int iHashCode7 = (this.colors.hashCode() + ((iHashCode6 + (url2 == null ? 0 : url2.hashCode())) * 31)) * 31;
            Map<String, ColorInformation> map2 = this.colorsByTier;
            int iHashCode8 = (iHashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
            List<Tier> list = this.tiers;
            int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.defaultTier;
            return iHashCode9 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Configuration(packageIds=");
            sb2.append(this.packageIds);
            sb2.append(", defaultPackage=");
            sb2.append(this.defaultPackage);
            sb2.append(", imagesWebp=");
            sb2.append(this.imagesWebp);
            sb2.append(", legacyImages=");
            sb2.append(this.legacyImages);
            sb2.append(", imagesByTier=");
            sb2.append(this.imagesByTier);
            sb2.append(", blurredBackgroundImage=");
            sb2.append(this.blurredBackgroundImage);
            sb2.append(", displayRestorePurchases=");
            sb2.append(this.displayRestorePurchases);
            sb2.append(", termsOfServiceURL=");
            sb2.append(this.termsOfServiceURL);
            sb2.append(", privacyURL=");
            sb2.append(this.privacyURL);
            sb2.append(", colors=");
            sb2.append(this.colors);
            sb2.append(", colorsByTier=");
            sb2.append(this.colorsByTier);
            sb2.append(", tiers=");
            sb2.append(this.tiers);
            sb2.append(", defaultTier=");
            return AbstractC9306j0.m9892k(sb2, this.defaultTier, ')');
        }

        public Configuration(List<String> packageIds, String str, Images images, Images images2, Map<String, Images> map, boolean z6, boolean z10, URL url, URL url2, ColorInformation colors, Map<String, ColorInformation> map2, List<Tier> list, String str2) {
            AbstractC16544l.m18094g(packageIds, "packageIds");
            AbstractC16544l.m18094g(colors, "colors");
            this.packageIds = packageIds;
            this.defaultPackage = str;
            this.imagesWebp = images;
            this.legacyImages = images2;
            this.imagesByTier = map;
            this.blurredBackgroundImage = z6;
            this.displayRestorePurchases = z10;
            this.termsOfServiceURL = url;
            this.privacyURL = url2;
            this.colors = colors;
            this.colorsByTier = map2;
            this.tiers = list;
            this.defaultTier = str2;
        }

        public /* synthetic */ Configuration(List list, String str, Images images, Images images2, Map map, boolean z6, boolean z10, URL url, URL url2, ColorInformation colorInformation, Map map2, List list2, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((List<String>) ((i10 & 1) != 0 ? C17689w.f56480Y : list), (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : images, (i10 & 8) != 0 ? null : images2, (Map<String, Images>) ((i10 & 16) != 0 ? null : map), (i10 & 32) != 0 ? false : z6, (i10 & 64) != 0 ? true : z10, (i10 & 128) != 0 ? null : url, (i10 & 256) != 0 ? null : url2, colorInformation, (Map<String, ColorInformation>) ((i10 & 1024) != 0 ? null : map2), (List<Tier>) ((i10 & 2048) != 0 ? null : list2), (i10 & 4096) != 0 ? null : str2);
        }

        public /* synthetic */ Configuration(List list, String str, Images images, Map map, ColorInformation colorInformation, Map map2, List list2, boolean z6, boolean z10, URL url, URL url2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i10 & 2) != 0 ? null : str, images, (i10 & 8) != 0 ? null : map, colorInformation, (i10 & 32) != 0 ? null : map2, (i10 & 64) != 0 ? null : list2, (i10 & 128) != 0 ? false : z6, (i10 & 256) != 0 ? true : z10, (i10 & 512) != 0 ? null : url, (i10 & 1024) != 0 ? null : url2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(List<String> packageIds, String str, Images images, Map<String, Images> map, ColorInformation colors, Map<String, ColorInformation> map2, List<Tier> list, boolean z6, boolean z10, URL url, URL url2) {
            this(packageIds, str, images, (Images) null, map, z6, z10, url, url2, colors, map2, list, (String) null, 4104, (DefaultConstructorMarker) null);
            AbstractC16544l.m18094g(packageIds, "packageIds");
            AbstractC16544l.m18094g(images, "images");
            AbstractC16544l.m18094g(colors, "colors");
        }
    }

    @Metadata(m18066d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0004UTVWB\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014B¹\u0001\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u001c\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(Jª\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001bJ\u0010\u0010,\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J(\u00108\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205HÇ\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\b@\u0010>\u001a\u0004\b?\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010:\u0012\u0004\bB\u0010>\u001a\u0004\bA\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010:\u0012\u0004\bD\u0010>\u001a\u0004\bC\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\bF\u0010>\u001a\u0004\bE\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\bH\u0010>\u001a\u0004\bG\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010:\u0012\u0004\bJ\u0010>\u001a\u0004\bI\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\bL\u0010>\u001a\u0004\bK\u0010\u001bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010%R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010:\u0012\u0004\bP\u0010>\u001a\u0004\bO\u0010\u001bR,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010Q\u0012\u0004\bS\u0010>\u001a\u0004\bR\u0010(¨\u0006X"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "", "", UiComponentConfig.Title.type, "subtitle", "callToAction", "callToActionWithIntroOffer", "callToActionWithMultipleIntroOffers", "offerDetails", "offerDetailsWithIntroOffer", "offerDetailsWithMultipleIntroOffers", "offerName", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "features", "tierName", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "offerOverrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lao/j0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "component12", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getSubtitle$annotations", "()V", "getCallToAction", "getCallToAction$annotations", "getCallToActionWithIntroOffer", "getCallToActionWithIntroOffer$annotations", "getCallToActionWithMultipleIntroOffers", "getCallToActionWithMultipleIntroOffers$annotations", "getOfferDetails", "getOfferDetails$annotations", "getOfferDetailsWithIntroOffer", "getOfferDetailsWithIntroOffer$annotations", "getOfferDetailsWithMultipleIntroOffers", "getOfferDetailsWithMultipleIntroOffers$annotations", "getOfferName", "getOfferName$annotations", "Ljava/util/List;", "getFeatures", "getTierName", "getTierName$annotations", "Ljava/util/Map;", "getOfferOverrides", "getOfferOverrides$annotations", "Companion", "$serializer", "Feature", "OfferOverride", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC8975g
    public static final /* data */ class LocalizedConfiguration {
        private final String callToAction;
        private final String callToActionWithIntroOffer;
        private final String callToActionWithMultipleIntroOffers;
        private final List<Feature> features;
        private final String offerDetails;
        private final String offerDetailsWithIntroOffer;
        private final String offerDetailsWithMultipleIntroOffers;
        private final String offerName;
        private final Map<String, OfferOverride> offerOverrides;
        private final String subtitle;
        private final String tierName;
        private final String title;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {null, null, null, null, null, null, null, null, null, new C11158d(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE, 0), null, new C11131E(C11181o0.f33827a, PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE, 1)};

        @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J2\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0016¨\u0006*"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "", "", UiComponentConfig.Title.type, "content", "iconID", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lao/j0;)V", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getContent", "getIconID", "getIconID$annotations", "()V", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC8975g
        public static final /* data */ class Feature {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String content;
            private final String iconID;
            private final String title;

            @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer serializer() {
                    return PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC17300c
            public /* synthetic */ Feature(int i10, String str, String str2, String str3, AbstractC11171j0 abstractC11171j0) {
                if (1 != (i10 & 1)) {
                    AbstractC11153a0.m12389l(i10, 1, PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.title = str;
                if ((i10 & 2) == 0) {
                    this.content = null;
                } else {
                    this.content = str2;
                }
                if ((i10 & 4) == 0) {
                    this.iconID = null;
                } else {
                    this.iconID = str3;
                }
            }

            public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = feature.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = feature.content;
                }
                if ((i10 & 4) != 0) {
                    str3 = feature.iconID;
                }
                return feature.copy(str, str2, str3);
            }

            public static /* synthetic */ void getIconID$annotations() {
            }

            public static final /* synthetic */ void write$Self(Feature self, InterfaceC10429b output, SerialDescriptor serialDesc) {
                output.mo5584r(serialDesc, 0, self.title);
                if (output.mo5565F(serialDesc) || self.content != null) {
                    output.mo5585s(serialDesc, 1, C11181o0.f33827a, self.content);
                }
                if (!output.mo5565F(serialDesc) && self.iconID == null) {
                    return;
                }
                output.mo5585s(serialDesc, 2, C11181o0.f33827a, self.iconID);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getIconID() {
                return this.iconID;
            }

            public final Feature copy(String title, String content, String iconID) {
                AbstractC16544l.m18094g(title, "title");
                return new Feature(title, content, iconID);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Feature)) {
                    return false;
                }
                Feature feature = (Feature) other;
                return AbstractC16544l.m18089b(this.title, feature.title) && AbstractC16544l.m18089b(this.content, feature.content) && AbstractC16544l.m18089b(this.iconID, feature.iconID);
            }

            public final String getContent() {
                return this.content;
            }

            public final String getIconID() {
                return this.iconID;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.content;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.iconID;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Feature(title=");
                sb2.append(this.title);
                sb2.append(", content=");
                sb2.append(this.content);
                sb2.append(", iconID=");
                return AbstractC9306j0.m9892k(sb2, this.iconID, ')');
            }

            public Feature(String title, String str, String str2) {
                AbstractC16544l.m18094g(title, "title");
                this.title = title;
                this.content = str;
                this.iconID = str2;
            }

            public /* synthetic */ Feature(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
            }
        }

        @Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBW\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018JH\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u0018¨\u00064"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "", "", "offerName", "offerDetails", "offerDetailsWithIntroOffer", "offerDetailsWithMultipleIntroOffers", "offerBadge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lao/j0;)V", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOfferName", "getOfferName$annotations", "()V", "getOfferDetails", "getOfferDetails$annotations", "getOfferDetailsWithIntroOffer", "getOfferDetailsWithIntroOffer$annotations", "getOfferDetailsWithMultipleIntroOffers", "getOfferDetailsWithMultipleIntroOffers$annotations", "getOfferBadge", "getOfferBadge$annotations", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC8975g
        public static final /* data */ class OfferOverride {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String offerBadge;
            private final String offerDetails;
            private final String offerDetailsWithIntroOffer;
            private final String offerDetailsWithMultipleIntroOffers;
            private final String offerName;

            @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer serializer() {
                    return PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC17300c
            public /* synthetic */ OfferOverride(int i10, String str, String str2, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str3, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str4, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str5, AbstractC11171j0 abstractC11171j0) {
                if (3 != (i10 & 3)) {
                    AbstractC11153a0.m12389l(i10, 3, PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.offerName = str;
                this.offerDetails = str2;
                if ((i10 & 4) == 0) {
                    this.offerDetailsWithIntroOffer = null;
                } else {
                    this.offerDetailsWithIntroOffer = str3;
                }
                if ((i10 & 8) == 0) {
                    this.offerDetailsWithMultipleIntroOffers = null;
                } else {
                    this.offerDetailsWithMultipleIntroOffers = str4;
                }
                if ((i10 & 16) == 0) {
                    this.offerBadge = null;
                } else {
                    this.offerBadge = str5;
                }
            }

            public static /* synthetic */ OfferOverride copy$default(OfferOverride offerOverride, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = offerOverride.offerName;
                }
                if ((i10 & 2) != 0) {
                    str2 = offerOverride.offerDetails;
                }
                String str6 = str2;
                if ((i10 & 4) != 0) {
                    str3 = offerOverride.offerDetailsWithIntroOffer;
                }
                String str7 = str3;
                if ((i10 & 8) != 0) {
                    str4 = offerOverride.offerDetailsWithMultipleIntroOffers;
                }
                String str8 = str4;
                if ((i10 & 16) != 0) {
                    str5 = offerOverride.offerBadge;
                }
                return offerOverride.copy(str, str6, str7, str8, str5);
            }

            @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getOfferBadge$annotations() {
            }

            public static /* synthetic */ void getOfferDetails$annotations() {
            }

            @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
            }

            @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
            }

            public static /* synthetic */ void getOfferName$annotations() {
            }

            public static final /* synthetic */ void write$Self(OfferOverride self, InterfaceC10429b output, SerialDescriptor serialDesc) {
                output.mo5584r(serialDesc, 0, self.offerName);
                output.mo5584r(serialDesc, 1, self.offerDetails);
                if (output.mo5565F(serialDesc) || self.offerDetailsWithIntroOffer != null) {
                    output.mo5585s(serialDesc, 2, EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithIntroOffer);
                }
                if (output.mo5565F(serialDesc) || self.offerDetailsWithMultipleIntroOffers != null) {
                    output.mo5585s(serialDesc, 3, EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithMultipleIntroOffers);
                }
                if (!output.mo5565F(serialDesc) && self.offerBadge == null) {
                    return;
                }
                output.mo5585s(serialDesc, 4, EmptyStringToNullSerializer.INSTANCE, self.offerBadge);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getOfferName() {
                return this.offerName;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getOfferDetails() {
                return this.offerDetails;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getOfferDetailsWithIntroOffer() {
                return this.offerDetailsWithIntroOffer;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getOfferDetailsWithMultipleIntroOffers() {
                return this.offerDetailsWithMultipleIntroOffers;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getOfferBadge() {
                return this.offerBadge;
            }

            public final OfferOverride copy(String offerName, String offerDetails, String offerDetailsWithIntroOffer, String offerDetailsWithMultipleIntroOffers, String offerBadge) {
                AbstractC16544l.m18094g(offerName, "offerName");
                AbstractC16544l.m18094g(offerDetails, "offerDetails");
                return new OfferOverride(offerName, offerDetails, offerDetailsWithIntroOffer, offerDetailsWithMultipleIntroOffers, offerBadge);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OfferOverride)) {
                    return false;
                }
                OfferOverride offerOverride = (OfferOverride) other;
                return AbstractC16544l.m18089b(this.offerName, offerOverride.offerName) && AbstractC16544l.m18089b(this.offerDetails, offerOverride.offerDetails) && AbstractC16544l.m18089b(this.offerDetailsWithIntroOffer, offerOverride.offerDetailsWithIntroOffer) && AbstractC16544l.m18089b(this.offerDetailsWithMultipleIntroOffers, offerOverride.offerDetailsWithMultipleIntroOffers) && AbstractC16544l.m18089b(this.offerBadge, offerOverride.offerBadge);
            }

            public final String getOfferBadge() {
                return this.offerBadge;
            }

            public final String getOfferDetails() {
                return this.offerDetails;
            }

            public final String getOfferDetailsWithIntroOffer() {
                return this.offerDetailsWithIntroOffer;
            }

            public final String getOfferDetailsWithMultipleIntroOffers() {
                return this.offerDetailsWithMultipleIntroOffers;
            }

            public final String getOfferName() {
                return this.offerName;
            }

            public int hashCode() {
                int iM527p = AbstractC0168G.m527p(this.offerName.hashCode() * 31, 31, this.offerDetails);
                String str = this.offerDetailsWithIntroOffer;
                int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.offerDetailsWithMultipleIntroOffers;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.offerBadge;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("OfferOverride(offerName=");
                sb2.append(this.offerName);
                sb2.append(", offerDetails=");
                sb2.append(this.offerDetails);
                sb2.append(", offerDetailsWithIntroOffer=");
                sb2.append(this.offerDetailsWithIntroOffer);
                sb2.append(", offerDetailsWithMultipleIntroOffers=");
                sb2.append(this.offerDetailsWithMultipleIntroOffers);
                sb2.append(", offerBadge=");
                return AbstractC9306j0.m9892k(sb2, this.offerBadge, ')');
            }

            public OfferOverride(String offerName, String offerDetails, String str, String str2, String str3) {
                AbstractC16544l.m18094g(offerName, "offerName");
                AbstractC16544l.m18094g(offerDetails, "offerDetails");
                this.offerName = offerName;
                this.offerDetails = offerDetails;
                this.offerDetailsWithIntroOffer = str;
                this.offerDetailsWithMultipleIntroOffers = str2;
                this.offerBadge = str3;
            }

            public /* synthetic */ OfferOverride(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
            }
        }

        @InterfaceC17300c
        public /* synthetic */ LocalizedConfiguration(int i10, String str, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str2, String str3, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str4, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str5, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str6, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str7, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str8, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str9, List list, @InterfaceC8975g(with = EmptyStringToNullSerializer.class) String str10, Map map, AbstractC11171j0 abstractC11171j0) {
            if (5 != (i10 & 5)) {
                AbstractC11153a0.m12389l(i10, 5, PaywallData$LocalizedConfiguration$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.title = str;
            if ((i10 & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.callToAction = str3;
            if ((i10 & 8) == 0) {
                this.callToActionWithIntroOffer = null;
            } else {
                this.callToActionWithIntroOffer = str4;
            }
            if ((i10 & 16) == 0) {
                this.callToActionWithMultipleIntroOffers = null;
            } else {
                this.callToActionWithMultipleIntroOffers = str5;
            }
            if ((i10 & 32) == 0) {
                this.offerDetails = null;
            } else {
                this.offerDetails = str6;
            }
            if ((i10 & 64) == 0) {
                this.offerDetailsWithIntroOffer = null;
            } else {
                this.offerDetailsWithIntroOffer = str7;
            }
            if ((i10 & 128) == 0) {
                this.offerDetailsWithMultipleIntroOffers = null;
            } else {
                this.offerDetailsWithMultipleIntroOffers = str8;
            }
            if ((i10 & 256) == 0) {
                this.offerName = null;
            } else {
                this.offerName = str9;
            }
            this.features = (i10 & 512) == 0 ? C17689w.f56480Y : list;
            if ((i10 & 1024) == 0) {
                this.tierName = null;
            } else {
                this.tierName = str10;
            }
            this.offerOverrides = (i10 & 2048) == 0 ? C17690x.f56481Y : map;
        }

        public static /* synthetic */ void getCallToAction$annotations() {
        }

        @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithIntroOffer$annotations() {
        }

        @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithMultipleIntroOffers$annotations() {
        }

        @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetails$annotations() {
        }

        @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
        }

        @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
        }

        @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferName$annotations() {
        }

        public static /* synthetic */ void getOfferOverrides$annotations() {
        }

        @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getSubtitle$annotations() {
        }

        @InterfaceC8975g(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getTierName$annotations() {
        }

        public static final /* synthetic */ void write$Self(LocalizedConfiguration self, InterfaceC10429b output, SerialDescriptor serialDesc) {
            KSerializer[] kSerializerArr = $childSerializers;
            output.mo5584r(serialDesc, 0, self.title);
            if (output.mo5565F(serialDesc) || self.subtitle != null) {
                output.mo5585s(serialDesc, 1, EmptyStringToNullSerializer.INSTANCE, self.subtitle);
            }
            output.mo5584r(serialDesc, 2, self.callToAction);
            if (output.mo5565F(serialDesc) || self.callToActionWithIntroOffer != null) {
                output.mo5585s(serialDesc, 3, EmptyStringToNullSerializer.INSTANCE, self.callToActionWithIntroOffer);
            }
            if (output.mo5565F(serialDesc) || self.callToActionWithMultipleIntroOffers != null) {
                output.mo5585s(serialDesc, 4, EmptyStringToNullSerializer.INSTANCE, self.callToActionWithMultipleIntroOffers);
            }
            if (output.mo5565F(serialDesc) || self.offerDetails != null) {
                output.mo5585s(serialDesc, 5, EmptyStringToNullSerializer.INSTANCE, self.offerDetails);
            }
            if (output.mo5565F(serialDesc) || self.offerDetailsWithIntroOffer != null) {
                output.mo5585s(serialDesc, 6, EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithIntroOffer);
            }
            if (output.mo5565F(serialDesc) || self.offerDetailsWithMultipleIntroOffers != null) {
                output.mo5585s(serialDesc, 7, EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithMultipleIntroOffers);
            }
            if (output.mo5565F(serialDesc) || self.offerName != null) {
                output.mo5585s(serialDesc, 8, EmptyStringToNullSerializer.INSTANCE, self.offerName);
            }
            if (output.mo5565F(serialDesc) || !AbstractC16544l.m18089b(self.features, C17689w.f56480Y)) {
                output.mo5575i(serialDesc, 9, kSerializerArr[9], self.features);
            }
            if (output.mo5565F(serialDesc) || self.tierName != null) {
                output.mo5585s(serialDesc, 10, EmptyStringToNullSerializer.INSTANCE, self.tierName);
            }
            if (!output.mo5565F(serialDesc) && AbstractC16544l.m18089b(self.offerOverrides, C17690x.f56481Y)) {
                return;
            }
            output.mo5575i(serialDesc, 11, kSerializerArr[11], self.offerOverrides);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<Feature> component10() {
            return this.features;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTierName() {
            return this.tierName;
        }

        public final Map<String, OfferOverride> component12() {
            return this.offerOverrides;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCallToAction() {
            return this.callToAction;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCallToActionWithIntroOffer() {
            return this.callToActionWithIntroOffer;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCallToActionWithMultipleIntroOffers() {
            return this.callToActionWithMultipleIntroOffers;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getOfferDetails() {
            return this.offerDetails;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getOfferDetailsWithIntroOffer() {
            return this.offerDetailsWithIntroOffer;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getOfferDetailsWithMultipleIntroOffers() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getOfferName() {
            return this.offerName;
        }

        public final LocalizedConfiguration copy(String title, String subtitle, String callToAction, String callToActionWithIntroOffer, String callToActionWithMultipleIntroOffers, String offerDetails, String offerDetailsWithIntroOffer, String offerDetailsWithMultipleIntroOffers, String offerName, List<Feature> features, String tierName, Map<String, OfferOverride> offerOverrides) {
            AbstractC16544l.m18094g(title, "title");
            AbstractC16544l.m18094g(callToAction, "callToAction");
            AbstractC16544l.m18094g(features, "features");
            AbstractC16544l.m18094g(offerOverrides, "offerOverrides");
            return new LocalizedConfiguration(title, subtitle, callToAction, callToActionWithIntroOffer, callToActionWithMultipleIntroOffers, offerDetails, offerDetailsWithIntroOffer, offerDetailsWithMultipleIntroOffers, offerName, features, tierName, offerOverrides);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalizedConfiguration)) {
                return false;
            }
            LocalizedConfiguration localizedConfiguration = (LocalizedConfiguration) other;
            return AbstractC16544l.m18089b(this.title, localizedConfiguration.title) && AbstractC16544l.m18089b(this.subtitle, localizedConfiguration.subtitle) && AbstractC16544l.m18089b(this.callToAction, localizedConfiguration.callToAction) && AbstractC16544l.m18089b(this.callToActionWithIntroOffer, localizedConfiguration.callToActionWithIntroOffer) && AbstractC16544l.m18089b(this.callToActionWithMultipleIntroOffers, localizedConfiguration.callToActionWithMultipleIntroOffers) && AbstractC16544l.m18089b(this.offerDetails, localizedConfiguration.offerDetails) && AbstractC16544l.m18089b(this.offerDetailsWithIntroOffer, localizedConfiguration.offerDetailsWithIntroOffer) && AbstractC16544l.m18089b(this.offerDetailsWithMultipleIntroOffers, localizedConfiguration.offerDetailsWithMultipleIntroOffers) && AbstractC16544l.m18089b(this.offerName, localizedConfiguration.offerName) && AbstractC16544l.m18089b(this.features, localizedConfiguration.features) && AbstractC16544l.m18089b(this.tierName, localizedConfiguration.tierName) && AbstractC16544l.m18089b(this.offerOverrides, localizedConfiguration.offerOverrides);
        }

        public final String getCallToAction() {
            return this.callToAction;
        }

        public final String getCallToActionWithIntroOffer() {
            return this.callToActionWithIntroOffer;
        }

        public final String getCallToActionWithMultipleIntroOffers() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final List<Feature> getFeatures() {
            return this.features;
        }

        public final String getOfferDetails() {
            return this.offerDetails;
        }

        public final String getOfferDetailsWithIntroOffer() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String getOfferDetailsWithMultipleIntroOffers() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String getOfferName() {
            return this.offerName;
        }

        public final Map<String, OfferOverride> getOfferOverrides() {
            return this.offerOverrides;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTierName() {
            return this.tierName;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iM527p = AbstractC0168G.m527p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.callToAction);
            String str2 = this.callToActionWithIntroOffer;
            int iHashCode2 = (iM527p + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.callToActionWithMultipleIntroOffers;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.offerDetails;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.offerDetailsWithIntroOffer;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.offerDetailsWithMultipleIntroOffers;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.offerName;
            int iM15858x = AbstractC14376f.m15858x(this.features, (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
            String str8 = this.tierName;
            return this.offerOverrides.hashCode() + ((iM15858x + (str8 != null ? str8.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("LocalizedConfiguration(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", callToAction=");
            sb2.append(this.callToAction);
            sb2.append(", callToActionWithIntroOffer=");
            sb2.append(this.callToActionWithIntroOffer);
            sb2.append(", callToActionWithMultipleIntroOffers=");
            sb2.append(this.callToActionWithMultipleIntroOffers);
            sb2.append(", offerDetails=");
            sb2.append(this.offerDetails);
            sb2.append(", offerDetailsWithIntroOffer=");
            sb2.append(this.offerDetailsWithIntroOffer);
            sb2.append(", offerDetailsWithMultipleIntroOffers=");
            sb2.append(this.offerDetailsWithMultipleIntroOffers);
            sb2.append(", offerName=");
            sb2.append(this.offerName);
            sb2.append(", features=");
            sb2.append(this.features);
            sb2.append(", tierName=");
            sb2.append(this.tierName);
            sb2.append(", offerOverrides=");
            return AbstractC12107L1.m13827r(sb2, this.offerOverrides, ')');
        }

        public LocalizedConfiguration(String title, String str, String callToAction, String str2, String str3, String str4, String str5, String str6, String str7, List<Feature> features, String str8, Map<String, OfferOverride> offerOverrides) {
            AbstractC16544l.m18094g(title, "title");
            AbstractC16544l.m18094g(callToAction, "callToAction");
            AbstractC16544l.m18094g(features, "features");
            AbstractC16544l.m18094g(offerOverrides, "offerOverrides");
            this.title = title;
            this.subtitle = str;
            this.callToAction = callToAction;
            this.callToActionWithIntroOffer = str2;
            this.callToActionWithMultipleIntroOffers = str3;
            this.offerDetails = str4;
            this.offerDetailsWithIntroOffer = str5;
            this.offerDetailsWithMultipleIntroOffers = str6;
            this.offerName = str7;
            this.features = features;
            this.tierName = str8;
            this.offerOverrides = offerOverrides;
        }

        public /* synthetic */ LocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? C17689w.f56480Y : list, (i10 & 1024) != 0 ? null : str10, (i10 & 2048) != 0 ? C17690x.f56481Y : map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallData(String templateName, Configuration config, URL url, int i10, Map<String, LocalizedConfiguration> localization, Map<String, ? extends Map<String, LocalizedConfiguration>> localizationByTier, List<String> zeroDecimalPlaceCountries, String str) {
        AbstractC16544l.m18094g(templateName, "templateName");
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(url, IGDwkYw.kXmHQbrjI);
        AbstractC16544l.m18094g(localization, "localization");
        AbstractC16544l.m18094g(localizationByTier, "localizationByTier");
        AbstractC16544l.m18094g(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
        this.templateName = templateName;
        this.config = config;
        this.assetBaseURL = url;
        this.revision = i10;
        this.localization = localization;
        this.localizationByTier = localizationByTier;
        this.zeroDecimalPlaceCountries = zeroDecimalPlaceCountries;
        this.defaultLocale = str;
    }

    public /* synthetic */ PaywallData(String str, Configuration configuration, URL url, int i10, Map map, Map map2, List list, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, configuration, url, (i11 & 8) != 0 ? 0 : i10, map, (i11 & 32) != 0 ? C17690x.f56481Y : map2, (i11 & 64) != 0 ? C17689w.f56480Y : list, (i11 & 128) != 0 ? null : str2);
    }
}
