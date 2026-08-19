package com.revenuecat.purchases.amazon;

import android.gov.nist.core.Separators;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONObject;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0004H\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m18067d2 = {"pattern", "Ljava/util/regex/Pattern;", "createPeriod", "Lcom/revenuecat/purchases/models/Period;", "", "createPrice", "Lcom/revenuecat/purchases/models/Price;", "marketplace", "parsePriceUsingRegex", "Ljava/math/BigDecimal;", "toStoreProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/amazon/device/iap/model/Product;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StoreProductConversionsKt {
    private static final Pattern pattern;

    static {
        Pattern patternCompile = Pattern.compile("(\\d+[[\\.,\\s]\\d+]*)");
        AbstractC16544l.m18093f(patternCompile, "compile(\"(\\\\d+[[\\\\.,\\\\s]\\\\d+]*)\")");
        pattern = patternCompile;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Period createPeriod(String str) {
        String str2;
        Integer numM21736w;
        AbstractC16544l.m18094g(str, "<this>");
        switch (str.hashCode()) {
            case -2115097178:
                if (str.equals("BiMonthly")) {
                    return new Period(2, Period.Unit.MONTH, "P2M");
                }
                break;
            case -1707840351:
                if (str.equals("Weekly")) {
                    return new Period(1, Period.Unit.WEEK, "P1W");
                }
                break;
            case -1393678355:
                if (str.equals("Monthly")) {
                    return new Period(1, Period.Unit.MONTH, "P1M");
                }
                break;
            case -580032564:
                if (str.equals("Annually")) {
                    return new Period(1, Period.Unit.YEAR, "P1Y");
                }
                break;
            case -308855462:
                if (str.equals("SemiAnnually")) {
                    return new Period(6, Period.Unit.MONTH, "P6M");
                }
                break;
            case 347098056:
                if (str.equals("BiWeekly")) {
                    return new Period(2, Period.Unit.WEEK, "P2W");
                }
                break;
            case 937940249:
                if (str.equals("Quarterly")) {
                    return new Period(3, Period.Unit.MONTH, "P3M");
                }
                break;
        }
        List listM21697e0 = AbstractC21322p.m21697e0(str, new String[]{Separators.f31991SP}, 0, 6);
        if (listM21697e0.size() != 2) {
            listM21697e0 = null;
        }
        if (listM21697e0 == null || (str2 = (String) AbstractC17680n.m19343S(listM21697e0)) == null || (numM21736w = AbstractC21329w.m21736w(str2)) == null) {
            return null;
        }
        int iIntValue = numM21736w.intValue();
        String strValueOf = String.valueOf(AbstractC21322p.m21673G((CharSequence) listM21697e0.get(1)));
        AbstractC16544l.m18092e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        AbstractC16544l.m18093f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return Period.INSTANCE.create("P" + iIntValue + upperCase);
    }

    public static final Price createPrice(String str, String marketplace) {
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(marketplace, "marketplace");
        BigDecimal priceNumeric = parsePriceUsingRegex(str);
        if (priceNumeric == null) {
            priceNumeric = BigDecimal.ZERO;
        }
        AbstractC16544l.m18093f(priceNumeric, "priceNumeric");
        BigDecimal bigDecimalMultiply = priceNumeric.multiply(new BigDecimal(UtilsKt.MICROS_MULTIPLIER));
        AbstractC16544l.m18093f(bigDecimalMultiply, "this.multiply(other)");
        return new Price(str, bigDecimalMultiply.longValue(), ISO3166Alpha2ToISO42170Converter.INSTANCE.convertOrEmpty(marketplace));
    }

    public static final BigDecimal parsePriceUsingRegex(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        Matcher matcher = pattern.matcher(str);
        if ((matcher.find() ? matcher : null) == null) {
            return null;
        }
        String dirtyPrice = matcher.group();
        AbstractC16544l.m18093f(dirtyPrice, "dirtyPrice");
        String string = AbstractC21322p.m21711s0(AbstractC21329w.m21731r(AbstractC21329w.m21731r(AbstractC21329w.m21731r(dirtyPrice, Separators.f31991SP, ""), " ", ""), " ", "")).toString();
        List listM21697e0 = AbstractC21322p.m21697e0(string, new String[]{Separators.DOT, Separators.COMMA}, 0, 6);
        if (listM21697e0.size() != 1) {
            if (((String) AbstractC17680n.m19351a0(listM21697e0)).length() == 3) {
                string = AbstractC21329w.m21731r(AbstractC21329w.m21731r(string, Separators.DOT, ""), Separators.COMMA, "");
            } else {
                string = AbstractC17680n.m19349Y(AbstractC17680n.m19337M(1, listM21697e0), "", null, null, 0, null, null, 62) + '.' + ((String) AbstractC17680n.m19351a0(listM21697e0));
            }
        }
        return new BigDecimal(AbstractC21322p.m21711s0(string).toString());
    }

    public static final StoreProduct toStoreProduct(Product product, String marketplace) {
        AbstractC16544l.m18094g(product, "<this>");
        AbstractC16544l.m18094g(marketplace, "marketplace");
        if (product.getPrice() == null) {
            AbstractC12107L1.m13831v(new Object[]{product.getSku()}, 1, AmazonStrings.PRODUCT_PRICE_MISSING, LogIntent.AMAZON_ERROR);
            return null;
        }
        String price = product.getPrice();
        AbstractC16544l.m18093f(price, "price");
        Price priceCreatePrice = createPrice(price, marketplace);
        String sku = product.getSku();
        AbstractC16544l.m18093f(sku, "sku");
        ProductType productType = product.getProductType();
        AbstractC16544l.m18093f(productType, "productType");
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        String title = product.getTitle();
        AbstractC16544l.m18093f(title, "title");
        String title2 = product.getTitle();
        AbstractC16544l.m18093f(title2, "title");
        String description = product.getDescription();
        AbstractC16544l.m18093f(description, "description");
        String subscriptionPeriod = product.getSubscriptionPeriod();
        Period periodCreatePeriod = subscriptionPeriod != null ? createPeriod(subscriptionPeriod) : null;
        String smallIconUrl = product.getSmallIconUrl();
        AbstractC16544l.m18093f(smallIconUrl, "smallIconUrl");
        String freeTrialPeriod = product.getFreeTrialPeriod();
        Period periodCreatePeriod2 = freeTrialPeriod != null ? createPeriod(freeTrialPeriod) : null;
        JSONObject json = product.toJSON();
        AbstractC16544l.m18093f(json, "this.toJSON()");
        return new AmazonStoreProduct(sku, revenueCatProductType, title, title2, description, periodCreatePeriod, priceCreatePrice, (SubscriptionOptions) null, (SubscriptionOption) null, smallIconUrl, periodCreatePeriod2, json, (PresentedOfferingContext) null);
    }
}
