package com.revenuecat.purchases;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.strings.SyncAttributesAndOfferingsStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CustomActivityLifecycleHandler;
import com.revenuecat.purchases.utils.RateLimiter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import mm.InterfaceC17306i;
import p007A5.C0376k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p165G9.AbstractC3021g;
import p468T2.C7214f;
import p523V9.AbstractC8128k6;
import p561X.C8990d;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9393x3;
import p826j6.C16149c;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000®\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 ¨\u00022\u00020\u00012\u00020\u0002:\u0002¨\u0002BÁ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00107\u001a\u0002012\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u0002012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0019\u0010?\u001a\u0002012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J9\u0010G\u001a\u0002012\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\b\u0010D\u001a\u0004\u0018\u00010\u00052\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u0002012\u0006\u0010:\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u001f\u0010O\u001a\u0002012\u0006\u0010>\u001a\u00020L2\b\b\u0002\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ/\u0010V\u001a\u0002012\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050Q2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010:\u001a\u00020U¢\u0006\u0004\bV\u0010WJ\u001d\u0010[\u001a\u0002012\u0006\u0010Y\u001a\u00020X2\u0006\u0010:\u001a\u00020Z¢\u0006\u0004\b[\u0010\\J\u0015\u0010^\u001a\u0002012\u0006\u0010:\u001a\u00020]¢\u0006\u0004\b^\u0010_J!\u0010b\u001a\u0002012\u0006\u0010`\u001a\u00020\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010a¢\u0006\u0004\bb\u0010cJ\u0019\u0010d\u001a\u0002012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010]¢\u0006\u0004\bd\u0010_J\r\u0010e\u001a\u000201¢\u0006\u0004\be\u00103J\u0015\u0010f\u001a\u0002012\u0006\u0010:\u001a\u00020]¢\u0006\u0004\bf\u0010_J\u001d\u0010f\u001a\u0002012\u0006\u0010h\u001a\u00020g2\u0006\u0010:\u001a\u00020]¢\u0006\u0004\bf\u0010iJ\r\u0010j\u001a\u000201¢\u0006\u0004\bj\u00103J#\u0010m\u001a\u0002012\u0006\u00106\u001a\u0002052\f\u0010l\u001a\b\u0012\u0004\u0012\u00020k0Q¢\u0006\u0004\bm\u0010nJ\r\u0010o\u001a\u000201¢\u0006\u0004\bo\u00103J1\u0010r\u001a\u0002012\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050p2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020S0p2\u0006\u0010:\u001a\u00020U¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u0002012\u0006\u0010u\u001a\u00020tH\u0007¢\u0006\u0004\bv\u0010wJ#\u0010z\u001a\u0002012\u0014\u0010y\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050x¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u0002012\b\u0010|\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0080\u0001\u001a\u0002012\b\u0010\u007f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u0080\u0001\u0010~J\u001a\u0010\u0082\u0001\u001a\u0002012\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u0082\u0001\u0010~J\u001a\u0010\u0084\u0001\u001a\u0002012\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u0084\u0001\u0010~J\u001a\u0010\u0086\u0001\u001a\u0002012\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u0086\u0001\u0010~J\u001a\u0010\u0088\u0001\u001a\u0002012\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u0088\u0001\u0010~J\u001a\u0010\u008a\u0001\u001a\u0002012\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u008a\u0001\u0010~J\u001a\u0010\u008c\u0001\u001a\u0002012\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u008c\u0001\u0010~J\u001a\u0010\u008e\u0001\u001a\u0002012\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u008e\u0001\u0010~J\u000f\u0010\u008f\u0001\u001a\u000201¢\u0006\u0005\b\u008f\u0001\u00103J\u001a\u0010\u0091\u0001\u001a\u0002012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u0091\u0001\u0010~J\u001a\u0010\u0093\u0001\u001a\u0002012\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u0093\u0001\u0010~J\u001a\u0010\u0095\u0001\u001a\u0002012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u0095\u0001\u0010~J\u001a\u0010\u0097\u0001\u001a\u0002012\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u0097\u0001\u0010~J\u001a\u0010\u0099\u0001\u001a\u0002012\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u0099\u0001\u0010~J\u001a\u0010\u009b\u0001\u001a\u0002012\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u009b\u0001\u0010~J\u001a\u0010\u009d\u0001\u001a\u0002012\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u009d\u0001\u0010~J\u001a\u0010\u009f\u0001\u001a\u0002012\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u009f\u0001\u0010~J\u001a\u0010¡\u0001\u001a\u0002012\t\u0010 \u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b¡\u0001\u0010~J\u001a\u0010£\u0001\u001a\u0002012\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b£\u0001\u0010~J\u001a\u0010¥\u0001\u001a\u0002012\t\u0010¤\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b¥\u0001\u0010~J\u0017\u0010¦\u0001\u001a\u0002012\u0006\u0010`\u001a\u00020\u0005¢\u0006\u0005\b¦\u0001\u0010~JA\u0010¬\u0001\u001a\u0002012\u0006\u00106\u001a\u0002052\b\u0010¨\u0001\u001a\u00030§\u00012\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u00012\t\u0010«\u0001\u001a\u0004\u0018\u00010M2\u0006\u0010>\u001a\u00020Z¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001JU\u0010²\u0001\u001a\u0002012\u0006\u00106\u001a\u0002052\b\u0010¨\u0001\u001a\u00030§\u00012\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u00012\u0007\u0010®\u0001\u001a\u00020\u00052\b\u0010°\u0001\u001a\u00030¯\u00012\t\u0010«\u0001\u001a\u0004\u0018\u00010M2\u0007\u0010±\u0001\u001a\u00020Z¢\u0006\u0006\b²\u0001\u0010³\u0001JL\u0010µ\u0001\u001a\u0002012\u0006\u00106\u001a\u0002052\b\u0010¨\u0001\u001a\u00030§\u00012\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u00012\u0007\u0010®\u0001\u001a\u00020\u00052\n\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00012\u0007\u0010>\u001a\u00030´\u0001¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\"\u0010¹\u0001\u001a\u0002012\u000e\u0010¸\u0001\u001a\t\u0012\u0004\u0012\u0002010·\u0001H\u0002¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001b\u0010¼\u0001\u001a\u00020M2\u0007\u0010»\u0001\u001a\u00020MH\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001JD\u0010r\u001a\u0002012\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050p2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020S0p2\u000e\u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030¾\u00010Q2\u0006\u0010:\u001a\u00020UH\u0002¢\u0006\u0005\br\u0010À\u0001J(\u0010Ã\u0001\u001a\u0002012\u0007\u0010Á\u0001\u001a\u00020\u00052\u000b\b\u0002\u0010Â\u0001\u001a\u0004\u0018\u00010]H\u0002¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\"\u0010Æ\u0001\u001a\u0002012\u000e\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u0002010·\u0001H\u0002¢\u0006\u0006\bÆ\u0001\u0010º\u0001J\u001d\u0010È\u0001\u001a\u0004\u0018\u00010Z2\u0007\u0010Ç\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0015\u0010Ê\u0001\u001a\u0005\u0018\u00010´\u0001H\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u0013\u0010Í\u0001\u001a\u00030Ì\u0001H\u0002¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u0018\u0010Ï\u0001\u001a\b\u0012\u0004\u0012\u00020Z0QH\u0002¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001JS\u0010Ø\u0001\u001aC\u0012\u001e\u0012\u001c\u0012\u0005\u0012\u00030Ó\u0001\u0012\u0005\u0012\u00030Ô\u0001\u0012\u0004\u0012\u0002010Ò\u0001j\u0003`Õ\u0001\u0012\u001e\u0012\u001c\u0012\u0005\u0012\u00030Ó\u0001\u0012\u0005\u0012\u00030Ö\u0001\u0012\u0004\u0012\u0002010Ò\u0001j\u0003`×\u00010Ñ\u0001H\u0002¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J_\u0010Û\u0001\u001aC\u0012\u001e\u0012\u001c\u0012\u0005\u0012\u00030Ó\u0001\u0012\u0005\u0012\u00030Ô\u0001\u0012\u0004\u0012\u0002010Ò\u0001j\u0003`Õ\u0001\u0012\u001e\u0012\u001c\u0012\u0005\u0012\u00030Ó\u0001\u0012\u0005\u0012\u00030Ö\u0001\u0012\u0004\u0012\u0002010Ò\u0001j\u0003`×\u00010Ñ\u00012\n\u0010Ú\u0001\u001a\u0005\u0018\u00010´\u0001H\u0002¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J!\u0010Æ\u0001\u001a\u000201*\u00030Ý\u00012\b\u0010Þ\u0001\u001a\u00030Ö\u0001H\u0002¢\u0006\u0006\bÆ\u0001\u0010ß\u0001Jb\u0010à\u0001\u001a\u0002012\b\u0010¨\u0001\u001a\u00030§\u00012\u0007\u0010®\u0001\u001a\u00020\u00052\n\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00012\u0006\u00106\u001a\u0002052\u0007\u0010Á\u0001\u001a\u00020\u00052\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u00012\t\u0010«\u0001\u001a\u0004\u0018\u00010M2\u0007\u0010>\u001a\u00030Ý\u0001H\u0002¢\u0006\u0006\bà\u0001\u0010á\u0001J\u0011\u0010â\u0001\u001a\u000201H\u0002¢\u0006\u0005\bâ\u0001\u00103J\u0011\u0010ã\u0001\u001a\u000201H\u0002¢\u0006\u0005\bã\u0001\u00103R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010ä\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010å\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010æ\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010ç\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010è\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010é\u0001R'\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010ï\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010ð\u0001R\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010ñ\u0001R\u001a\u0010\u001a\u001a\u00020\u00198\u0007¢\u0006\u000f\n\u0005\b\u001a\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010õ\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010ö\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010÷\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010ø\u0001R\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010ù\u0001R\u0017\u0010&\u001a\u0004\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010ú\u0001R\u0015\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010û\u0001R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010ü\u0001R\u0017\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010ý\u0001R\u0015\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010þ\u0001R!\u0010\u0084\u0002\u001a\u00030ÿ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0080\u0002\u0010\u0081\u0002\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0018\u0010\u0086\u0002\u001a\u00030\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R.\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u00052\t\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R,\u0010\u0093\u0002\u001a\u00030\u008d\u00022\b\u0010\u008e\u0002\u001a\u00030\u008d\u00028@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R*\u0010\u0098\u0002\u001a\u00020M2\u0007\u0010\u008e\u0002\u001a\u00020M8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0014\u0010Á\u0001\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010\u008c\u0002R0\u0010\u009f\u0002\u001a\u0005\u0018\u00010\u009a\u00022\n\u0010\u008e\u0002\u001a\u0005\u0018\u00010\u009a\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002\"\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0014\u0010 \u0002\u001a\u00020M8F¢\u0006\b\u001a\u0006\b \u0002\u0010\u0095\u0002R\u0015\u0010¤\u0002\u001a\u00030¡\u00028F¢\u0006\b\u001a\u0006\b¢\u0002\u0010£\u0002R*\u0010§\u0002\u001a\u00020M2\u0007\u0010\u008e\u0002\u001a\u00020M8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¥\u0002\u0010\u0095\u0002\"\u0006\b¦\u0002\u0010\u0097\u0002¨\u0006©\u0002"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesOrchestrator;", "Lcom/revenuecat/purchases/LifecycleDelegate;", "Lcom/revenuecat/purchases/utils/CustomActivityLifecycleHandler;", "Landroid/app/Application;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "", "backingFieldAppUserID", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "customerInfoHelper", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "diagnosticsSynchronizer", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "postTransactionWithProductDetailsHelper", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Lcom/revenuecat/purchases/SyncPurchasesHelper;", "syncPurchasesHelper", "Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "offeringsManager", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;", "paywallEventsManager", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "paywallPresentedCache", "Lcom/revenuecat/purchases/PurchasesStateCache;", "purchasesStateCache", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "<init>", "(Landroid/app/Application;Ljava/lang/String;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/CustomerInfoHelper;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/PostReceiptHelper;Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Lcom/revenuecat/purchases/SyncPurchasesHelper;Lcom/revenuecat/purchases/common/offerings/OfferingsManager;Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;Lcom/revenuecat/purchases/PurchasesStateCache;Landroid/os/Handler;Lcom/revenuecat/purchases/common/Dispatcher;)V", "Lmm/C;", "onAppBackgrounded", "()V", "onAppForegrounded", "Landroid/app/Activity;", "activity", "onActivityStarted", "(Landroid/app/Activity;)V", "Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;", "callback", "syncAttributesAndOfferingsIfNeeded", "(Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V", "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "listener", "syncPurchases", "(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V", "productID", "receiptID", "amazonUserID", "isoCurrencyCode", "", "price", "syncAmazonPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;", "getAmazonLWAConsentStatus", "(Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "", "fetchCurrent", "getOfferings", "(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;Z)V", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "getProducts", "(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchase", "(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "restorePurchases", "(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "newAppUserID", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "logIn", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V", "logOut", "close", "getCustomerInfo", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "(Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "removeUpdatedCustomerInfoListener", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "invalidateCustomerInfoCache", "", "types", "getProductsOfTypes", "(Ljava/util/Set;Ljava/util/Set;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "paywallEvent", "track", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;)V", "", "attributes", "setAttributes", "(Ljava/util/Map;)V", "email", "setEmail", "(Ljava/lang/String;)V", "phoneNumber", "setPhoneNumber", "displayName", "setDisplayName", "fcmToken", "setPushToken", "mixpanelDistinctID", "setMixpanelDistinctID", "onesignalID", "setOnesignalID", "onesignalUserID", "setOnesignalUserID", "airshipChannelID", "setAirshipChannelID", "firebaseAppInstanceID", "setFirebaseAppInstanceID", "collectDeviceIdentifiers", "adjustID", "setAdjustID", "appsflyerID", "setAppsflyerID", "fbAnonymousID", "setFBAnonymousID", "mparticleID", "setMparticleID", "cleverTapID", "setCleverTapID", "mediaSource", "setMediaSource", "campaign", "setCampaign", "adGroup", "setAdGroup", "ad", "setAd", "keyword", "setKeyword", "creative", "setCreative", "switchUser", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "isPersonalizedPrice", "startPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "oldProductId", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "googleReplacementMode", "purchaseCallback", "startProductChange", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "startDeprecatedProductChange", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)V", "Lkotlin/Function0;", "command", "enqueue", "(LBm/a;)V", "firstTimeInForeground", "shouldRefreshCustomerInfo", "(Z)Z", "Lcom/revenuecat/purchases/models/StoreProduct;", "collectedStoreProducts", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "appUserID", "completion", "updateAllCaches", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "action", "dispatch", "productId", "getPurchaseCallback", "(Ljava/lang/String;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "getAndClearProductChangeCallback", "()Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getPurchasesUpdatedListener", "()Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getAndClearAllPurchaseCallbacks", "()Ljava/util/List;", "Landroid/util/Pair;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "getPurchaseCompletedCallbacks", "()Landroid/util/Pair;", "productChangeListener", "getProductChangeCompletedCallbacks", "(Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)Landroid/util/Pair;", "Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;", "error", "(Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;Lcom/revenuecat/purchases/PurchasesError;)V", "replaceOldPurchaseWithNewProduct", "(Lcom/revenuecat/purchases/models/PurchasingData;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;)V", "synchronizeSubscriberAttributesIfNeeded", "flushPaywallEvents", "Landroid/app/Application;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/AppConfig;", "getAppConfig", "()Lcom/revenuecat/purchases/common/AppConfig;", "setAppConfig", "(Lcom/revenuecat/purchases/common/AppConfig;)V", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "getOfflineEntitlementsManager", "()Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Lcom/revenuecat/purchases/SyncPurchasesHelper;", "Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "Lcom/revenuecat/purchases/PurchasesStateCache;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/AppLifecycleHandler;", "lifecycleHandler$delegate", "Lmm/i;", "getLifecycleHandler", "()Lcom/revenuecat/purchases/AppLifecycleHandler;", "lifecycleHandler", "Lcom/revenuecat/purchases/utils/RateLimiter;", "lastSyncAttributesAndOfferingsRateLimiter", "Lcom/revenuecat/purchases/utils/RateLimiter;", "<set-?>", "storefrontCountryCode", "Ljava/lang/String;", "getStorefrontCountryCode", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/PurchasesState;", "value", "getState$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/PurchasesState;", "setState$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/PurchasesState;)V", "state", "getFinishTransactions", "()Z", "setFinishTransactions", "(Z)V", "finishTransactions", "getAppUserID", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "updatedCustomerInfoListener", "isAnonymous", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "getAllowSharingPlayStoreAccount", "setAllowSharingPlayStoreAccount", "allowSharingPlayStoreAccount", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PurchasesOrchestrator implements LifecycleDelegate, CustomActivityLifecycleHandler {
    public static final String frameworkVersion = "8.6.0";
    private static URL proxyURL;
    private AppConfig appConfig;
    private final Application application;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final DiagnosticsSynchronizer diagnosticsSynchronizer;
    private final Dispatcher dispatcher;
    private final IdentityManager identityManager;
    private final RateLimiter lastSyncAttributesAndOfferingsRateLimiter;

    /* JADX INFO: renamed from: lifecycleHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i lifecycleHandler;
    private final Handler mainHandler;
    private final OfferingsManager offeringsManager;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallEventsManager paywallEventsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;
    private final PostReceiptHelper postReceiptHelper;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;
    private final PurchasesStateCache purchasesStateCache;
    private String storefrontCountryCode;
    private final SubscriberAttributesManager subscriberAttributesManager;
    private final SyncPurchasesHelper syncPurchasesHelper;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static PlatformInfo platformInfo = new PlatformInfo("native", null);

    @Metadata(m18066d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesOrchestrator$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "Lcom/revenuecat/purchases/interfaces/Callback;", "", "callback", "Lmm/C;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V", "Lcom/revenuecat/purchases/common/PlatformInfo;", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "setPlatformInfo", "(Lcom/revenuecat/purchases/common/PlatformInfo;)V", "value", "getDebugLogsEnabled", "()Z", "setDebugLogsEnabled", "(Z)V", "debugLogsEnabled", "Lcom/revenuecat/purchases/LogLevel;", "getLogLevel", "()Lcom/revenuecat/purchases/LogLevel;", "setLogLevel", "(Lcom/revenuecat/purchases/LogLevel;)V", "logLevel", "Lcom/revenuecat/purchases/LogHandler;", "getLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "logHandler", "Ljava/net/URL;", "proxyURL", "Ljava/net/URL;", "getProxyURL", "()Ljava/net/URL;", "setProxyURL", "(Ljava/net/URL;)V", "", "frameworkVersion", "Ljava/lang/String;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                list = C17689w.f56480Y;
            }
            companion.canMakePayments(context, list, callback);
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> features, Callback<Boolean> callback) {
            AbstractC16544l.m18094g(context, "context");
            AbstractC16544l.m18094g(features, "features");
            AbstractC16544l.m18094g(callback, "callback");
            C7214f c7214f = new C7214f(context);
            c7214f.f22888a = new C0376k(false, 10);
            c7214f.f22890c = new C8990d(4);
            C16149c c16149cM7605a = c7214f.m7605a();
            c16149cM7605a.mo17714h(new PurchasesOrchestrator$Companion$canMakePayments$2$1(new Handler(context.getMainLooper()), new AtomicBoolean(false), callback, c16149cM7605a, features));
        }

        public final boolean getDebugLogsEnabled() {
            return LogUtilsKt.getDebugLogsEnabled(getLogLevel());
        }

        public final synchronized LogHandler getLogHandler() {
            return LogWrapperKt.getCurrentLogHandler();
        }

        public final LogLevel getLogLevel() {
            return Config.INSTANCE.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.platformInfo;
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.proxyURL;
        }

        public final void setDebugLogsEnabled(boolean z6) {
            setLogLevel(LogUtilsKt.debugLogsEnabled(LogLevel.INSTANCE, z6));
        }

        public final synchronized void setLogHandler(LogHandler value) {
            AbstractC16544l.m18094g(value, "value");
            LogWrapperKt.setCurrentLogHandler(value);
        }

        public final void setLogLevel(LogLevel value) {
            AbstractC16544l.m18094g(value, "value");
            Config.INSTANCE.setLogLevel(value);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            AbstractC16544l.m18094g(platformInfo, "<set-?>");
            PurchasesOrchestrator.platformInfo = platformInfo;
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.proxyURL = url;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$dispatch$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126211 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ PurchaseErrorCallback $this_dispatch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126211(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
            super(0);
            this.$this_dispatch = purchaseErrorCallback;
            this.$error = purchasesError;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22480invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22480invoke() {
            PurchaseErrorCallback purchaseErrorCallback = this.$this_dispatch;
            PurchasesError purchasesError = this.$error;
            purchaseErrorCallback.onError(purchasesError, purchasesError.getCode() == PurchasesErrorCode.PurchaseCancelledError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getAmazonLWAConsentStatus$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/AmazonLWAConsentStatus;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126221 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ GetAmazonLWAConsentStatusCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126221(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
            super(1);
            this.$callback = getAmazonLWAConsentStatusCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AmazonLWAConsentStatus) obj);
            return C17296C.f55119a;
        }

        public final void invoke(AmazonLWAConsentStatus it) {
            AbstractC16544l.m18094g(it, "it");
            this.$callback.onSuccess(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getAmazonLWAConsentStatus$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126232 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ GetAmazonLWAConsentStatusCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126232(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
            super(1);
            this.$callback = getAmazonLWAConsentStatusCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC16544l.m18094g(it, "it");
            this.$callback.onError(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getOfferings$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126241 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126241(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC16544l.m18094g(it, "it");
            this.$listener.onError(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getOfferings$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/Offerings;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126252 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126252(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Offerings it) {
            AbstractC16544l.m18094g(it, "it");
            this.$listener.onReceived(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$3 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126363 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$3$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1426a {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LogInCallback logInCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = logInCallback;
                this.$customerInfo = customerInfo;
            }

            @Override // p049Bm.InterfaceC1426a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22487invoke();
                return C17296C.f55119a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22487invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onReceived(this.$customerInfo, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126363(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return C17296C.f55119a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC16544l.m18094g(customerInfo, "customerInfo");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$4 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126374 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$4$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1426a {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LogInCallback logInCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = logInCallback;
                this.$error = purchasesError;
            }

            @Override // p049Bm.InterfaceC1426a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22488invoke();
                return C17296C.f55119a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22488invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onError(this.$error);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126374(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC16544l.m18094g(error, "error");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, error));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logOut$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126381 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126381(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesOrchestrator purchasesOrchestrator) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
            this.this$0 = purchasesOrchestrator;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(purchasesError);
                    return;
                }
                return;
            }
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            synchronized (purchasesOrchestrator) {
                PurchasesState state$purchases_customEntitlementComputationRelease = purchasesOrchestrator.getState$purchases_customEntitlementComputationRelease();
                Map mapEmptyMap = Collections.emptyMap();
                AbstractC16544l.m18093f(mapEmptyMap, "emptyMap()");
                purchasesOrchestrator.setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(state$purchases_customEntitlementComputationRelease, null, mapEmptyMap, null, false, false, 29, null));
            }
            PurchasesOrchestrator purchasesOrchestrator2 = this.this$0;
            purchasesOrchestrator2.updateAllCaches(purchasesOrchestrator2.identityManager.getCurrentAppUserID(), this.$callback);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$onAppForegrounded$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126392 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ C16556x $firstTimeInForeground;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126392(C16556x c16556x) {
            super(0);
            this.$firstTimeInForeground = c16556x;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22489invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22489invoke() {
            DiagnosticsSynchronizer diagnosticsSynchronizer;
            if (PurchasesOrchestrator.this.shouldRefreshCustomerInfo(this.$firstTimeInForeground.f51285Y)) {
                LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
                CustomerInfoHelper.retrieveCustomerInfo$default(PurchasesOrchestrator.this.customerInfoHelper, PurchasesOrchestrator.this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.FETCH_CURRENT, false, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, 16, null);
            }
            PurchasesOrchestrator.this.offeringsManager.onAppForeground(PurchasesOrchestrator.this.identityManager.getCurrentAppUserID());
            PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.this.postPendingTransactionsHelper, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, null, 6, null);
            PurchasesOrchestrator.this.synchronizeSubscriberAttributesIfNeeded();
            OfflineEntitlementsManager.updateProductEntitlementMappingCacheIfStale$default(PurchasesOrchestrator.this.getOfflineEntitlementsManager(), null, 1, null);
            PurchasesOrchestrator.this.flushPaywallEvents();
            if (this.$firstTimeInForeground.f51285Y && AndroidVersionUtilsKt.isAndroidNOrNewer() && (diagnosticsSynchronizer = PurchasesOrchestrator.this.diagnosticsSynchronizer) != null) {
                diagnosticsSynchronizer.syncDiagnosticsFileIfNeeded();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "purchaseRecord", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126402 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ C16525B $previousProductId;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126402(C16525B c16525b, PurchasesOrchestrator purchasesOrchestrator, Activity activity, String str, PurchasingData purchasingData, GoogleReplacementMode googleReplacementMode, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
            super(1);
            this.$previousProductId = c16525b;
            this.this$0 = purchasesOrchestrator;
            this.$activity = activity;
            this.$appUserID = str;
            this.$purchasingData = purchasingData;
            this.$googleReplacementMode = googleReplacementMode;
            this.$presentedOfferingContext = presentedOfferingContext;
            this.$isPersonalizedPrice = bool;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoreTransaction) obj);
            return C17296C.f55119a;
        }

        public final void invoke(StoreTransaction purchaseRecord) {
            AbstractC16544l.m18094g(purchaseRecord, "purchaseRecord");
            AbstractC12107L1.m13831v(new Object[]{this.$previousProductId.f51262Y}, 1, PurchaseStrings.FOUND_EXISTING_PURCHASE, LogIntent.PURCHASE);
            this.this$0.billing.makePurchaseAsync(this.$activity, this.$appUserID, this.$purchasingData, new ReplaceProductInfo(purchaseRecord, this.$googleReplacementMode), this.$presentedOfferingContext, this.$isPersonalizedPrice);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126413 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ PurchaseErrorCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126413(PurchaseErrorCallback purchaseErrorCallback) {
            super(1);
            this.$listener = purchaseErrorCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC16544l.m18094g(error, "error");
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, error.toString());
            PurchasesOrchestrator.this.getAndClearProductChangeCallback();
            PurchasesOrchestrator.this.getAndClearAllPurchaseCallbacks();
            PurchasesOrchestrator.this.dispatch(this.$listener, error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allPurchases", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126421 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126421(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, String str) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
            this.$appUserID = str;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<StoreTransaction>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(List<StoreTransaction> allPurchases) {
            AbstractC16544l.m18094g(allPurchases, "allPurchases");
            if (allPurchases.isEmpty()) {
                PurchasesOrchestrator.this.getCustomerInfo(this.$callback);
                return;
            }
            List<StoreTransaction> listM19370t0 = AbstractC17680n.m19370t0(allPurchases, new Comparator() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return AbstractC3021g.m3873a(Long.valueOf(((StoreTransaction) t10).getPurchaseTime()), Long.valueOf(((StoreTransaction) t11).getPurchaseTime()));
                }
            });
            PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
            String str = this.$appUserID;
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            for (StoreTransaction storeTransaction : listM19370t0) {
                purchasesOrchestrator.postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, null, true, str, PostReceiptInitiationSource.RESTORE, new PurchasesOrchestrator$restorePurchases$1$2$1$1(storeTransaction, listM19370t0, purchasesOrchestrator, receiveCustomerInfoCallback), new PurchasesOrchestrator$restorePurchases$1$2$1$2(storeTransaction, listM19370t0, purchasesOrchestrator, receiveCustomerInfoCallback));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126462 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$2$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1426a {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$error = purchasesError;
            }

            @Override // p049Bm.InterfaceC1426a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22492invoke();
                return C17296C.f55119a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22492invoke() {
                this.$callback.onError(this.$error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126462(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC16544l.m18094g(error, "error");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, error));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$showInAppMessagesIfNeeded$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126471 extends AbstractC16546n implements InterfaceC1426a {
        public C126471() {
            super(0);
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22493invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22493invoke() {
            PurchasesOrchestrator.syncPurchases$default(PurchasesOrchestrator.this, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$3 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "normalizedProductID", "Lmm/C;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126483 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ String $isoCurrencyCode;
        final /* synthetic */ Double $price;
        final /* synthetic */ String $receiptID;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$3$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return C17296C.f55119a;
            }

            public final void invoke(CustomerInfo it) {
                AbstractC16544l.m18094g(it, "it");
                LogWrapperKt.log(LogIntent.PURCHASE, String.format(PurchaseStrings.PURCHASE_SYNCED_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID}, 2)));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$3$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return C17296C.f55119a;
            }

            public final void invoke(PurchasesError error) {
                AbstractC16544l.m18094g(error, "error");
                LogWrapperKt.log(LogIntent.RC_ERROR, String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, error}, 3)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126483(Double d10, String str, PurchasesOrchestrator purchasesOrchestrator, String str2, String str3, String str4) {
            super(1);
            this.$price = d10;
            this.$isoCurrencyCode = str;
            this.this$0 = purchasesOrchestrator;
            this.$receiptID = str2;
            this.$amazonUserID = str3;
            this.$appUserID = str4;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C17296C.f55119a;
        }

        public final void invoke(String normalizedProductID) {
            AbstractC16544l.m18094g(normalizedProductID, "normalizedProductID");
            List listM9974d = AbstractC9393x3.m9974d(normalizedProductID);
            Double d10 = this.$price;
            Double d11 = (d10 == null || d10.doubleValue() == 0.0d) ? null : d10;
            String str = this.$isoCurrencyCode;
            this.this$0.postReceiptHelper.postTokenWithoutConsuming(this.$receiptID, this.$amazonUserID, new ReceiptInfo(listM9974d, null, null, null, d11, (str == null || AbstractC21322p.m21681O(str)) ? null : str, null, 78, null), this.this$0.getAllowSharingPlayStoreAccount(), this.$appUserID, null, PostReceiptInitiationSource.RESTORE, new AnonymousClass1(this.$receiptID, this.$amazonUserID), new AnonymousClass2(this.$receiptID, this.$amazonUserID));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$4 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126494 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $receiptID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126494(String str, String str2) {
            super(1);
            this.$receiptID = str;
            this.$amazonUserID = str2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC16544l.m18094g(error, "error");
            LogWrapperKt.log(LogIntent.RC_ERROR, String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, error}, 3)));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126501 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ C12651x42dece3e $receiveOfferingsCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126501(C12651x42dece3e c12651x42dece3e) {
            super(0);
            this.$receiveOfferingsCallback = c12651x42dece3e;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22494invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22494invoke() {
            PurchasesOrchestrator.this.getOfferings(this.$receiveOfferingsCallback, true);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncPurchases$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126521 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126521(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return C17296C.f55119a;
        }

        public final void invoke(CustomerInfo it) {
            AbstractC16544l.m18094g(it, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onSuccess(it);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncPurchases$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126532 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126532(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC16544l.m18094g(it, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onError(it);
            }
        }
    }

    public PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billing, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, PaywallEventsManager paywallEventsManager, PaywallPresentedCache paywallPresentedCache, PurchasesStateCache purchasesStateCache, Handler handler, Dispatcher dispatcher) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(backend, "backend");
        AbstractC16544l.m18094g(billing, "billing");
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        AbstractC16544l.m18094g(identityManager, "identityManager");
        AbstractC16544l.m18094g(subscriberAttributesManager, "subscriberAttributesManager");
        AbstractC16544l.m18094g(appConfig, "appConfig");
        AbstractC16544l.m18094g(customerInfoHelper, "customerInfoHelper");
        AbstractC16544l.m18094g(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        AbstractC16544l.m18094g(offlineEntitlementsManager, "offlineEntitlementsManager");
        AbstractC16544l.m18094g(postReceiptHelper, "postReceiptHelper");
        AbstractC16544l.m18094g(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        AbstractC16544l.m18094g(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        AbstractC16544l.m18094g(syncPurchasesHelper, "syncPurchasesHelper");
        AbstractC16544l.m18094g(offeringsManager, "offeringsManager");
        AbstractC16544l.m18094g(paywallPresentedCache, "paywallPresentedCache");
        AbstractC16544l.m18094g(purchasesStateCache, "purchasesStateCache");
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        this.application = application;
        this.backend = backend;
        this.billing = billing;
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.appConfig = appConfig;
        this.customerInfoHelper = customerInfoHelper;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.diagnosticsSynchronizer = diagnosticsSynchronizer;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.postReceiptHelper = postReceiptHelper;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.syncPurchasesHelper = syncPurchasesHelper;
        this.offeringsManager = offeringsManager;
        this.paywallEventsManager = paywallEventsManager;
        this.paywallPresentedCache = paywallPresentedCache;
        this.purchasesStateCache = purchasesStateCache;
        this.mainHandler = handler;
        this.dispatcher = dispatcher;
        this.lifecycleHandler = AbstractC9227W.m9800c(new PurchasesOrchestrator$lifecycleHandler$2(this));
        C21554a c21554a = C21555b.f68260Z;
        this.lastSyncAttributesAndOfferingsRateLimiter = new RateLimiter(5, AbstractC8128k6.m8644j(60, EnumC21557d.SECONDS), null);
        identityManager.configure(str);
        billing.setStateListener(new BillingAbstract.StateListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.1
            @Override // com.revenuecat.purchases.common.BillingAbstract.StateListener
            public void onConnected() {
                PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.this.postPendingTransactionsHelper, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, null, 6, null);
                PurchasesOrchestrator.this.billing.getStorefront(new PurchasesOrchestrator$1$onConnected$1(PurchasesOrchestrator.this), PurchasesOrchestrator$1$onConnected$2.INSTANCE);
            }
        });
        billing.setPurchasesUpdatedListener(getPurchasesUpdatedListener());
        BillingAbstract.startConnectionOnMainThread$default(billing, 0L, 1, null);
        dispatch(new C126192());
        if (this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            return;
        }
        LogWrapperKt.log(LogIntent.WARNING, ConfigureStrings.AUTO_SYNC_PURCHASES_DISABLED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(InterfaceC1426a action) {
        if (AbstractC16544l.m18089b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            action.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new RunnableC12657a(action, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$17(InterfaceC1426a tmp0) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final void enqueue(InterfaceC1426a command) {
        this.dispatcher.enqueue(new RunnableC12657a(command, 3), Delay.NONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$12(InterfaceC1426a command) {
        AbstractC16544l.m18094g(command, "$command");
        command.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushPaywallEvents() {
        PaywallEventsManager paywallEventsManager;
        if (!AndroidVersionUtilsKt.isAndroidNOrNewer() || (paywallEventsManager = this.paywallEventsManager) == null) {
            return;
        }
        paywallEventsManager.flushEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PurchaseCallback> getAndClearAllPurchaseCallbacks() {
        List<PurchaseCallback> listM19322C0;
        synchronized (this) {
            Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId();
            PurchasesState state$purchases_customEntitlementComputationRelease = getState$purchases_customEntitlementComputationRelease();
            Map mapEmptyMap = Collections.emptyMap();
            AbstractC16544l.m18093f(mapEmptyMap, "emptyMap()");
            setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(state$purchases_customEntitlementComputationRelease, null, mapEmptyMap, null, false, false, 29, null));
            listM19322C0 = AbstractC17680n.m19322C0(purchaseCallbacksByProductId.values());
        }
        return listM19322C0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductChangeCallback getAndClearProductChangeCallback() {
        ProductChangeCallback deprecatedProductChangeCallback = getState$purchases_customEntitlementComputationRelease().getDeprecatedProductChangeCallback();
        setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, null, null, false, false, 27, null));
        return deprecatedProductChangeCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppLifecycleHandler getLifecycleHandler() {
        return (AppLifecycleHandler) this.lifecycleHandler.getValue();
    }

    public static /* synthetic */ void getOfferings$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveOfferingsCallback receiveOfferingsCallback, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        purchasesOrchestrator.getOfferings(receiveOfferingsCallback, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<InterfaceC1439n, InterfaceC1439n> getProductChangeCompletedCallbacks(ProductChangeCallback productChangeListener) {
        return new Pair<>(new C12627xd134a901(productChangeListener, this), new C12626xca5e6606(productChangeListener, this));
    }

    public static /* synthetic */ void getProducts$default(PurchasesOrchestrator purchasesOrchestrator, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchaseCallback getPurchaseCallback(String productId) {
        PurchaseCallback purchaseCallback = getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId().get(productId);
        PurchasesState state$purchases_customEntitlementComputationRelease = getState$purchases_customEntitlementComputationRelease();
        Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PurchaseCallback> entry : purchaseCallbacksByProductId.entrySet()) {
            if (!AbstractC16544l.m18089b(entry.getKey(), productId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(state$purchases_customEntitlementComputationRelease, null, linkedHashMap, null, false, false, 29, null));
        return purchaseCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<InterfaceC1439n, InterfaceC1439n> getPurchaseCompletedCallbacks() {
        return new Pair<>(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(this), new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1(this));
    }

    private final BillingAbstract.PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return new BillingAbstract.PurchasesUpdatedListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.getPurchasesUpdatedListener.1
            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesFailedToUpdate(PurchasesError purchasesError) {
                C17296C c17296c;
                AbstractC16544l.m18094g(purchasesError, "purchasesError");
                PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
                synchronized (purchasesOrchestrator) {
                    try {
                        ProductChangeCallback andClearProductChangeCallback = purchasesOrchestrator.getAndClearProductChangeCallback();
                        if (andClearProductChangeCallback != null) {
                            purchasesOrchestrator.dispatch(andClearProductChangeCallback, purchasesError);
                            c17296c = C17296C.f55119a;
                        } else {
                            c17296c = null;
                        }
                        if (c17296c == null) {
                            Iterator it = purchasesOrchestrator.getAndClearAllPurchaseCallbacks().iterator();
                            while (it.hasNext()) {
                                purchasesOrchestrator.dispatch((PurchaseCallback) it.next(), purchasesError);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesUpdated(List<StoreTransaction> purchases) {
                Pair productChangeCompletedCallbacks;
                AbstractC16544l.m18094g(purchases, "purchases");
                PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
                synchronized (purchasesOrchestrator) {
                    try {
                        productChangeCompletedCallbacks = purchasesOrchestrator.getState$purchases_customEntitlementComputationRelease().getDeprecatedProductChangeCallback() != null ? purchasesOrchestrator.getProductChangeCompletedCallbacks(purchasesOrchestrator.getAndClearProductChangeCallback()) : purchasesOrchestrator.getPurchaseCompletedCallbacks();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                PurchasesOrchestrator.this.postTransactionWithProductDetailsHelper.postTransactions(purchases, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), PurchasesOrchestrator.this.getAppUserID(), PostReceiptInitiationSource.PURCHASE, (InterfaceC1439n) productChangeCompletedCallbacks.first, (InterfaceC1439n) productChangeCompletedCallbacks.second);
            }
        };
    }

    public static /* synthetic */ void logIn$default(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logInCallback = null;
        }
        purchasesOrchestrator.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    private final void replaceOldPurchaseWithNewProduct(PurchasingData purchasingData, String oldProductId, GoogleReplacementMode googleReplacementMode, Activity activity, String appUserID, PresentedOfferingContext presentedOfferingContext, Boolean isPersonalizedPrice, PurchaseErrorCallback listener) {
        ProductType productType = purchasingData.getProductType();
        ProductType productType2 = ProductType.SUBS;
        if (productType != productType2) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            ProductChangeCallback andClearProductChangeCallback = getAndClearProductChangeCallback();
            if (andClearProductChangeCallback != null) {
                dispatch(andClearProductChangeCallback, purchasesError);
            }
            Iterator<T> it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError);
            }
            return;
        }
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = oldProductId;
        if (AbstractC21322p.m21667A(oldProductId, ":", false)) {
            c16525b.f51262Y = AbstractC21322p.m21706n0(oldProductId, ":");
            StringBuilder sbM11058p = AbstractC10763a.m11058p("Using incorrect oldProductId: ", oldProductId, ". The productId should not contain the basePlanId. Using productId: ");
            sbM11058p.append((String) c16525b.f51262Y);
            sbM11058p.append('.');
            LogUtilsKt.warnLog(sbM11058p.toString());
        }
        this.billing.findPurchaseInPurchaseHistory(appUserID, productType2, (String) c16525b.f51262Y, new C126402(c16525b, this, activity, appUserID, purchasingData, googleReplacementMode, presentedOfferingContext, isPersonalizedPrice), new C126413(listener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRefreshCustomerInfo(boolean firstTimeInForeground) {
        if (this.appConfig.getCustomEntitlementComputation()) {
            return false;
        }
        return firstTimeInForeground || this.deviceCache.isCustomerInfoCacheStale(getAppUserID(), false);
    }

    public static /* synthetic */ void syncPurchases$default(PurchasesOrchestrator purchasesOrchestrator, SyncPurchasesCallback syncPurchasesCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void synchronizeSubscriberAttributesIfNeeded() {
        SubscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers$default(this.subscriberAttributesManager, getAppUserID(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAllCaches(String appUserID, ReceiveCustomerInfoCallback completion) {
        boolean appInBackground = getState$purchases_customEntitlementComputationRelease().getAppInBackground();
        this.customerInfoHelper.retrieveCustomerInfo(appUserID, CacheFetchPolicy.FETCH_CURRENT, appInBackground, getAllowSharingPlayStoreAccount(), completion);
        OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, appUserID, appInBackground, null, null, 12, null);
    }

    public static /* synthetic */ void updateAllCaches$default(PurchasesOrchestrator purchasesOrchestrator, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.updateAllCaches(str, receiveCustomerInfoCallback);
    }

    public final void close() {
        synchronized (this) {
            PurchasesState state$purchases_customEntitlementComputationRelease = getState$purchases_customEntitlementComputationRelease();
            Map mapEmptyMap = Collections.emptyMap();
            AbstractC16544l.m18093f(mapEmptyMap, "emptyMap()");
            setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(state$purchases_customEntitlementComputationRelease, null, mapEmptyMap, null, false, false, 29, null));
        }
        this.backend.close();
        this.billing.close();
        setUpdatedCustomerInfoListener(null);
        dispatch(new C126202());
    }

    public final void collectDeviceIdentifiers() {
        AbstractC12107L1.m13831v(new Object[]{"collectDeviceIdentifiers"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.collectDeviceIdentifiers(getAppUserID(), this.application);
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        Boolean allowSharingPlayStoreAccount;
        try {
            allowSharingPlayStoreAccount = getState$purchases_customEntitlementComputationRelease().getAllowSharingPlayStoreAccount();
        } catch (Throwable th2) {
            throw th2;
        }
        return allowSharingPlayStoreAccount != null ? allowSharingPlayStoreAccount.booleanValue() : this.identityManager.currentUserIsAnonymous();
    }

    public final void getAmazonLWAConsentStatus(GetAmazonLWAConsentStatusCallback callback) {
        AbstractC16544l.m18094g(callback, "callback");
        this.billing.getAmazonLWAConsentStatus(new C126221(callback), new C126232(callback));
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final synchronized String getAppUserID() {
        return this.identityManager.getCurrentAppUserID();
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback callback) {
        AbstractC16544l.m18094g(callback, "callback");
        getCustomerInfo(CacheFetchPolicy.INSTANCE.m22466default(), callback);
    }

    public final synchronized boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    public final void getOfferings(ReceiveOfferingsCallback listener, boolean fetchCurrent) {
        AbstractC16544l.m18094g(listener, "listener");
        this.offeringsManager.getOfferings(this.identityManager.getCurrentAppUserID(), getState$purchases_customEntitlementComputationRelease().getAppInBackground(), new C126241(listener), new C126252(listener), fetchCurrent);
    }

    public final OfflineEntitlementsManager getOfflineEntitlementsManager() {
        return this.offlineEntitlementsManager;
    }

    public final void getProducts(List<String> productIds, ProductType type, final GetStoreProductsCallback callback) {
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(callback, "callback");
        getProductsOfTypes(AbstractC17680n.m19328G0(productIds), type != null ? AbstractC17665J.m19268h(type) : AbstractC17678l.m19293P(new ProductType[]{ProductType.SUBS, ProductType.INAPP}), new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.getProducts.1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError error) {
                AbstractC16544l.m18094g(error, "error");
                callback.onError(error);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> storeProducts) {
                AbstractC16544l.m18094g(storeProducts, "storeProducts");
                callback.onReceived(storeProducts);
            }
        });
    }

    public final void getProductsOfTypes(Set<String> productIds, Set<? extends ProductType> types, GetStoreProductsCallback callback) {
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(types, "types");
        AbstractC16544l.m18094g(callback, "callback");
        ArrayList arrayList = new ArrayList();
        for (Object obj : types) {
            if (((ProductType) obj) != ProductType.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        getProductsOfTypes(productIds, AbstractC17680n.m19328G0(arrayList), C17689w.f56480Y, callback);
    }

    public final PurchasesState getState$purchases_customEntitlementComputationRelease() {
        return this.purchasesStateCache.getPurchasesState();
    }

    public final Store getStore() {
        return this.appConfig.getStore();
    }

    public final String getStorefrontCountryCode() {
        return this.storefrontCountryCode;
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.customerInfoUpdateHandler.getUpdatedCustomerInfoListener();
    }

    public final void invalidateCustomerInfoCache() {
        LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.INVALIDATING_CUSTOMERINFO_CACHE);
        this.deviceCache.clearCustomerInfoCache(getAppUserID());
    }

    public final boolean isAnonymous() {
        return this.identityManager.currentUserIsAnonymous();
    }

    public final void logIn(String newAppUserID, LogInCallback callback) {
        AbstractC16544l.m18094g(newAppUserID, "newAppUserID");
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        C17296C c17296c = null;
        if (AbstractC16544l.m18089b(currentAppUserID, newAppUserID)) {
            currentAppUserID = null;
        }
        if (currentAppUserID != null) {
            this.identityManager.logIn(newAppUserID, new PurchasesOrchestrator$logIn$2$1(this, newAppUserID, callback), new PurchasesOrchestrator$logIn$2$2(this, callback));
            c17296c = C17296C.f55119a;
        }
        if (c17296c == null) {
            this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.INSTANCE.m22466default(), getState$purchases_customEntitlementComputationRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), ListenerConversionsCommonKt.receiveCustomerInfoCallback(new C126363(callback), new C126374(callback)));
        }
    }

    public final void logOut(ReceiveCustomerInfoCallback callback) {
        this.identityManager.logOut(new C126381(callback, this));
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        if (this.appConfig.getShowInAppMessagesAutomatically()) {
            showInAppMessagesIfNeeded(activity, AbstractC17678l.m19291N(InAppMessageType.values()));
        }
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityStopped(this, activity);
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppBackgrounded() {
        synchronized (this) {
            setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, null, null, true, false, 23, null));
        }
        LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.APP_BACKGROUNDED);
        synchronizeSubscriberAttributesIfNeeded();
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppForegrounded() {
        C16556x c16556x = new C16556x();
        synchronized (this) {
            c16556x.f51285Y = getState$purchases_customEntitlementComputationRelease().getFirstTimeInForeground();
            setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, null, null, false, false, 7, null));
        }
        LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.APP_FOREGROUNDED);
        enqueue(new C126392(c16556x));
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback callback) {
        C17296C c17296c;
        AbstractC16544l.m18094g(purchaseParams, "purchaseParams");
        AbstractC16544l.m18094g(callback, "callback");
        String oldProductId = purchaseParams.getOldProductId();
        if (oldProductId != null) {
            startProductChange(purchaseParams.getActivity(), purchaseParams.getPurchasingData(), purchaseParams.getPresentedOfferingContext(), oldProductId, purchaseParams.getGoogleReplacementMode(), purchaseParams.getIsPersonalizedPrice(), callback);
            c17296c = C17296C.f55119a;
        } else {
            c17296c = null;
        }
        if (c17296c == null) {
            startPurchase(purchaseParams.getActivity(), purchaseParams.getPurchasingData(), purchaseParams.getPresentedOfferingContext(), purchaseParams.getIsPersonalizedPrice(), callback);
        }
    }

    public final void removeUpdatedCustomerInfoListener() {
        setUpdatedCustomerInfoListener(null);
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback callback) {
        AbstractC16544l.m18094g(callback, "callback");
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.RESTORING_PURCHASE);
        if (!getAllowSharingPlayStoreAccount()) {
            LogWrapperKt.log(LogIntent.WARNING, RestoreStrings.SHARING_ACC_RESTORE_FALSE);
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new C126421(callback, currentAppUserID), new C126462(callback));
    }

    public final void setAd(String ad2) {
        AbstractC12107L1.m13831v(new Object[]{"setAd"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.C12710Ad.INSTANCE, ad2, getAppUserID());
    }

    public final void setAdGroup(String adGroup) {
        AbstractC12107L1.m13831v(new Object[]{"setAdGroup"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE, adGroup, getAppUserID());
    }

    public final void setAdjustID(String adjustID) {
        AbstractC12107L1.m13831v(new Object[]{"setAdjustID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Adjust.INSTANCE, adjustID, getAppUserID(), this.application);
    }

    public final void setAirshipChannelID(String airshipChannelID) {
        AbstractC12107L1.m13831v(new Object[]{"setAirshipChannelID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.Airship.INSTANCE, airshipChannelID, getAppUserID());
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z6) {
        setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), Boolean.valueOf(z6), null, null, false, false, 30, null));
    }

    public final void setAppConfig(AppConfig appConfig) {
        AbstractC16544l.m18094g(appConfig, "<set-?>");
        this.appConfig = appConfig;
    }

    public final void setAppsflyerID(String appsflyerID) {
        AbstractC12107L1.m13831v(new Object[]{"setAppsflyerID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.AppsFlyer.INSTANCE, appsflyerID, getAppUserID(), this.application);
    }

    public final void setAttributes(Map<String, String> attributes) {
        AbstractC16544l.m18094g(attributes, "attributes");
        AbstractC12107L1.m13831v(new Object[]{"setAttributes"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributes(attributes, getAppUserID());
    }

    public final void setCampaign(String campaign) {
        AbstractC12107L1.m13831v(new Object[]{"setCampaign"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE, campaign, getAppUserID());
    }

    public final void setCleverTapID(String cleverTapID) {
        AbstractC12107L1.m13831v(new Object[]{"setCleverTapID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.CleverTap.INSTANCE, cleverTapID, getAppUserID(), this.application);
    }

    public final void setCreative(String creative) {
        AbstractC12107L1.m13831v(new Object[]{"setCreative"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE, creative, getAppUserID());
    }

    public final void setDisplayName(String displayName) {
        AbstractC12107L1.m13831v(new Object[]{"setDisplayName"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.DisplayName.INSTANCE, displayName, getAppUserID());
    }

    public final void setEmail(String email) {
        AbstractC12107L1.m13831v(new Object[]{"setEmail"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.Email.INSTANCE, email, getAppUserID());
    }

    public final void setFBAnonymousID(String fbAnonymousID) {
        AbstractC12107L1.m13831v(new Object[]{"setFBAnonymousID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Facebook.INSTANCE, fbAnonymousID, getAppUserID(), this.application);
    }

    public final synchronized void setFinishTransactions(boolean z6) {
        this.appConfig.setFinishTransactions(z6);
    }

    public final void setFirebaseAppInstanceID(String firebaseAppInstanceID) {
        AbstractC12107L1.m13831v(new Object[]{"setFirebaseAppInstanceID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.FirebaseAppInstanceId.INSTANCE, firebaseAppInstanceID, getAppUserID());
    }

    public final void setKeyword(String keyword) {
        AbstractC12107L1.m13831v(new Object[]{"seKeyword"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE, keyword, getAppUserID());
    }

    public final void setMediaSource(String mediaSource) {
        AbstractC12107L1.m13831v(new Object[]{"setMediaSource"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE, mediaSource, getAppUserID());
    }

    public final void setMixpanelDistinctID(String mixpanelDistinctID) {
        AbstractC12107L1.m13831v(new Object[]{"setMixpanelDistinctID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.MixpanelDistinctId.INSTANCE, mixpanelDistinctID, getAppUserID());
    }

    public final void setMparticleID(String mparticleID) {
        AbstractC12107L1.m13831v(new Object[]{"setMparticleID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Mparticle.INSTANCE, mparticleID, getAppUserID(), this.application);
    }

    public final void setOnesignalID(String onesignalID) {
        AbstractC12107L1.m13831v(new Object[]{"setOnesignalID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignal.INSTANCE, onesignalID, getAppUserID());
    }

    public final void setOnesignalUserID(String onesignalUserID) {
        AbstractC12107L1.m13831v(new Object[]{"setOnesignalUserID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignalUserId.INSTANCE, onesignalUserID, getAppUserID());
    }

    public final void setPhoneNumber(String phoneNumber) {
        AbstractC12107L1.m13831v(new Object[]{"setPhoneNumber"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.PhoneNumber.INSTANCE, phoneNumber, getAppUserID());
    }

    public final void setPushToken(String fcmToken) {
        AbstractC12107L1.m13831v(new Object[]{"setPushToken"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.FCMTokens.INSTANCE, fcmToken, getAppUserID());
    }

    public final void setState$purchases_customEntitlementComputationRelease(PurchasesState value) {
        AbstractC16544l.m18094g(value, "value");
        this.purchasesStateCache.setPurchasesState(value);
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.customerInfoUpdateHandler.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(inAppMessageTypes, "inAppMessageTypes");
        this.billing.showInAppMessagesIfNeeded(activity, inAppMessageTypes, new C126471());
    }

    public final void startDeprecatedProductChange(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String oldProductId, GoogleReplacementMode googleReplacementMode, ProductChangeCallback listener) {
        String currentAppUserID;
        String offeringIdentifier;
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(purchasingData, "purchasingData");
        AbstractC16544l.m18094g(oldProductId, "oldProductId");
        AbstractC16544l.m18094g(listener, "listener");
        if (purchasingData.getProductType() != ProductType.SUBS) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(listener, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        StringBuilder sb2 = new StringBuilder(Separators.f31991SP);
        sb2.append(purchasingData);
        sb2.append(' ');
        C17296C c17296c = null;
        AbstractC10763a.m11067y(sb2, (presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) ? null : PurchaseStrings.OFFERING.concat(offeringIdentifier), " oldProductId: ", oldProductId, " googleReplacementMode ");
        sb2.append(googleReplacementMode);
        AbstractC12107L1.m13831v(new Object[]{sb2.toString()}, 1, PurchaseStrings.PRODUCT_CHANGE_STARTED, logIntent);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (getState$purchases_customEntitlementComputationRelease().getDeprecatedProductChangeCallback() == null) {
                    setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, null, listener, false, false, 27, null));
                    currentAppUserID = this.identityManager.getCurrentAppUserID();
                } else {
                    currentAppUserID = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (currentAppUserID != null) {
            replaceOldPurchaseWithNewProduct(purchasingData, oldProductId, googleReplacementMode, activity, currentAppUserID, presentedOfferingContext, null, listener);
            c17296c = C17296C.f55119a;
        }
        if (c17296c == null) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, c17296c, 2, c17296c);
            LogUtilsKt.errorLog(purchasesError2);
            dispatch(listener, purchasesError2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startProductChange(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String oldProductId, GoogleReplacementMode googleReplacementMode, Boolean isPersonalizedPrice, PurchaseCallback purchaseCallback) {
        String currentAppUserID;
        C17296C c17296c;
        String offeringIdentifier;
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(purchasingData, "purchasingData");
        AbstractC16544l.m18094g(oldProductId, "oldProductId");
        AbstractC16544l.m18094g(googleReplacementMode, "googleReplacementMode");
        AbstractC16544l.m18094g(purchaseCallback, "purchaseCallback");
        if (purchasingData.getProductType() != ProductType.SUBS) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(purchaseCallback, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        StringBuilder sb2 = new StringBuilder(Separators.f31991SP);
        sb2.append(purchasingData);
        sb2.append(' ');
        String str = null;
        Object[] objArr = 0;
        AbstractC10763a.m11067y(sb2, (presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) ? null : PurchaseStrings.OFFERING.concat(offeringIdentifier), " oldProductId: ", oldProductId, " googleReplacementMode ");
        sb2.append(googleReplacementMode);
        AbstractC12107L1.m13831v(new Object[]{sb2.toString()}, 1, PurchaseStrings.PRODUCT_CHANGE_STARTED, logIntent);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    currentAppUserID = null;
                } else {
                    setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, AbstractC17659D.m19248j(getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId(), AbstractC17660E.m19258c(new C17309l(googleReplacementMode == GoogleReplacementMode.DEFERRED ? oldProductId : purchasingData.getProductId(), purchaseCallback))), null, false, false, 29, null));
                    currentAppUserID = this.identityManager.getCurrentAppUserID();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (currentAppUserID != null) {
            replaceOldPurchaseWithNewProduct(purchasingData, oldProductId, googleReplacementMode, activity, currentAppUserID, presentedOfferingContext, isPersonalizedPrice, purchaseCallback);
            c17296c = C17296C.f55119a;
        } else {
            c17296c = null;
        }
        if (c17296c == null) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, str, 2, objArr == true ? 1 : 0);
            LogUtilsKt.errorLog(purchasesError2);
            Iterator<T> it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startPurchase(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, Boolean isPersonalizedPrice, PurchaseCallback listener) {
        String currentAppUserID;
        C17296C c17296c;
        String offeringIdentifier;
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(purchasingData, "purchasingData");
        AbstractC16544l.m18094g(listener, "listener");
        LogIntent logIntent = LogIntent.PURCHASE;
        StringBuilder sb2 = new StringBuilder(Separators.f31991SP);
        sb2.append(purchasingData);
        sb2.append(' ');
        String str = null;
        Object[] objArr = 0;
        sb2.append((presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) ? null : PurchaseStrings.OFFERING.concat(offeringIdentifier));
        AbstractC12107L1.m13831v(new Object[]{sb2.toString()}, 1, PurchaseStrings.PURCHASE_STARTED, logIntent);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    currentAppUserID = null;
                } else {
                    setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, AbstractC17659D.m19248j(getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId(), AbstractC17660E.m19258c(new C17309l(purchasingData.getProductId(), listener))), null, false, false, 29, null));
                    currentAppUserID = this.identityManager.getCurrentAppUserID();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (currentAppUserID != null) {
            this.billing.makePurchaseAsync(activity, currentAppUserID, purchasingData, null, presentedOfferingContext, isPersonalizedPrice);
            c17296c = C17296C.f55119a;
        } else {
            c17296c = null;
        }
        if (c17296c == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, str, 2, objArr == true ? 1 : 0);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(listener, purchasesError);
        }
    }

    public final void switchUser(String newAppUserID) {
        AbstractC16544l.m18094g(newAppUserID, "newAppUserID");
        if (AbstractC16544l.m18089b(this.identityManager.getCurrentAppUserID(), newAppUserID)) {
            LogUtilsKt.warnLog(String.format(IdentityStrings.SWITCHING_USER_SAME_APP_USER_ID, Arrays.copyOf(new Object[]{newAppUserID}, 1)));
        } else {
            this.identityManager.switchUser(newAppUserID);
            OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, newAppUserID, getState$purchases_customEntitlementComputationRelease().getAppInBackground(), null, null, 12, null);
        }
    }

    public final void syncAmazonPurchase(String productID, String receiptID, String amazonUserID, String isoCurrencyCode, Double price) {
        AbstractC16544l.m18094g(productID, "productID");
        AbstractC16544l.m18094g(receiptID, "receiptID");
        AbstractC16544l.m18094g(amazonUserID, "amazonUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        AbstractC12107L1.m13831v(new Object[]{receiptID, amazonUserID}, 2, PurchaseStrings.SYNCING_PURCHASE_STORE_USER_ID, logIntent);
        Set<String> previouslySentHashedTokens = this.deviceCache.getPreviouslySentHashedTokens();
        if (!previouslySentHashedTokens.contains(UtilsKt.sha1(receiptID))) {
            previouslySentHashedTokens = null;
        }
        if (previouslySentHashedTokens != null) {
            AbstractC12107L1.m13831v(new Object[]{receiptID, amazonUserID}, 2, PurchaseStrings.SYNCING_PURCHASE_SKIPPING, logIntent);
        } else {
            this.billing.normalizePurchaseData(productID, receiptID, amazonUserID, new C126483(price, isoCurrencyCode, this, receiptID, amazonUserID, this.identityManager.getCurrentAppUserID()), new C126494(receiptID, amazonUserID));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.revenuecat.purchases.PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1, com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback] */
    public final void syncAttributesAndOfferingsIfNeeded(final SyncAttributesAndOfferingsCallback callback) {
        AbstractC16544l.m18094g(callback, "callback");
        ?? r6 = new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError error) {
                AbstractC16544l.m18094g(error, "error");
                callback.onError(error);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                AbstractC16544l.m18094g(offerings, "offerings");
                callback.onSuccess(offerings);
            }
        };
        if (this.lastSyncAttributesAndOfferingsRateLimiter.shouldProceed()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getAppUserID(), new C126501(r6));
            return;
        }
        LogIntent logIntent = LogIntent.WARNING;
        Integer numValueOf = Integer.valueOf(this.lastSyncAttributesAndOfferingsRateLimiter.getMaxCallsInPeriod());
        long jM22532getPeriodSecondsUwyO8pc = this.lastSyncAttributesAndOfferingsRateLimiter.getPeriodSeconds();
        C21554a c21554a = C21555b.f68260Z;
        AbstractC12107L1.m13831v(new Object[]{numValueOf, Long.valueOf(C21555b.m21841k(jM22532getPeriodSecondsUwyO8pc, EnumC21557d.SECONDS))}, 2, SyncAttributesAndOfferingsStrings.RATE_LIMIT_REACHED, logIntent);
        getOfferings$default(this, r6, false, 2, null);
    }

    public final void syncPurchases(SyncPurchasesCallback listener) {
        this.syncPurchasesHelper.syncPurchases(getAllowSharingPlayStoreAccount(), getState$purchases_customEntitlementComputationRelease().getAppInBackground(), new C126521(listener), new C126532(listener));
    }

    public final void track(PaywallEvent paywallEvent) {
        PaywallEventsManager paywallEventsManager;
        AbstractC16544l.m18094g(paywallEvent, "paywallEvent");
        this.paywallPresentedCache.receiveEvent(paywallEvent);
        if (!AndroidVersionUtilsKt.isAndroidNOrNewer() || (paywallEventsManager = this.paywallEventsManager) == null) {
            return;
        }
        paywallEventsManager.track(paywallEvent);
    }

    public final void getCustomerInfo(CacheFetchPolicy fetchPolicy, ReceiveCustomerInfoCallback callback) {
        AbstractC16544l.m18094g(fetchPolicy, "fetchPolicy");
        AbstractC16544l.m18094g(callback, "callback");
        this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), fetchPolicy, getState$purchases_customEntitlementComputationRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), callback);
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$close$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126202 extends AbstractC16546n implements InterfaceC1426a {
        public C126202() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22479invoke() {
            ProcessLifecycleOwner.f33399u0.f33405r0.mo7808c(PurchasesOrchestrator.this.getLifecycleHandler());
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22479invoke();
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126192 extends AbstractC16546n implements InterfaceC1426a {
        public C126192() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22478invoke() {
            ProcessLifecycleOwner.f33399u0.f33405r0.mo7806a(PurchasesOrchestrator.this.getLifecycleHandler());
            PurchasesOrchestrator.this.application.registerActivityLifecycleCallbacks(PurchasesOrchestrator.this);
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22478invoke();
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        dispatch(new C126211(purchaseErrorCallback, purchasesError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getProductsOfTypes(Set<String> productIds, Set<? extends ProductType> types, List<? extends StoreProduct> collectedStoreProducts, GetStoreProductsCallback callback) {
        Set setM19326F0 = AbstractC17680n.m19326F0(types);
        ProductType productType = (ProductType) AbstractC17680n.m19342R(setM19326F0);
        C17296C c17296c = null;
        if (productType != null) {
            setM19326F0.remove(productType);
        } else {
            productType = null;
        }
        if (productType != null) {
            this.billing.queryProductDetailsAsync(productType, productIds, new PurchasesOrchestrator$getProductsOfTypes$1$1(this, productIds, setM19326F0, collectedStoreProducts, callback), new PurchasesOrchestrator$getProductsOfTypes$1$2(this, callback));
            c17296c = C17296C.f55119a;
        }
        if (c17296c == null) {
            callback.onReceived(collectedStoreProducts);
        }
    }

    public /* synthetic */ PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, PaywallEventsManager paywallEventsManager, PaywallPresentedCache paywallPresentedCache, PurchasesStateCache purchasesStateCache, Handler handler, Dispatcher dispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, backend, billingAbstract, deviceCache, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, paywallEventsManager, paywallPresentedCache, purchasesStateCache, (i10 & 1048576) != 0 ? new Handler(Looper.getMainLooper()) : handler, dispatcher);
    }
}
