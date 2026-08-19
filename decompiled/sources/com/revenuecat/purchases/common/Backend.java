package com.revenuecat.purchases.common;

import android.gov.nist.javax.sip.parser.TokenNames;
import bo.AbstractC11516d;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.PostReceiptResponseKt;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.events.PaywallEventRequest;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p009A7.FlM.nkFZpTrMPpn;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0083\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJK\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u00142\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ½\u0001\u0010/\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122 \u0010 \u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f0\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0\u0014j\u0002`*2$\u0010\u0019\u001a \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\r0+j\u0002`.¢\u0006\u0004\b/\u00100JK\u00101\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\r0\u00142\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b1\u0010\u001bJK\u00105\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00102\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00172\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b5\u00106JI\u00109\u001a\u00020\r2\f\u00108\u001a\b\u0012\u0004\u0012\u00020-072\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\r0\u00142\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b9\u0010:J?\u0010>\u001a\u00020\r2\u0006\u0010<\u001a\u00020;2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\r0=2\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0017H\u0007¢\u0006\u0004\b>\u0010?J5\u0010A\u001a\u00020\r2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\r0\u00142\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\r¢\u0006\u0004\bC\u0010\u000fJ\u001f\u0010G\u001a\u00020,2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u0018H\u0002¢\u0006\u0004\bG\u0010HJs\u0010U\u001a\u00020\r\"\u0004\b\u0000\u0010I\"\u0004\b\u0001\u0010J* \u0012\u0004\u0012\u00020L\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010N0M0K2\u0006\u0010P\u001a\u00020O2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020L2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010N2\b\b\u0002\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJy\u0010X\u001a\u00020\r\"\u0004\b\u0000\u0010W\"\u0004\b\u0001\u0010I\"\u0004\b\u0002\u0010J* \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020N0M0K2\u0006\u0010P\u001a\u00020O2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010Q\u001a\u00028\u00002\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020N2\b\b\u0002\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bX\u0010YR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ZR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010[R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010[R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\\R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010]Rª\u0001\u0010`\u001aB\u0012\u0004\u0012\u00020L\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170Nj\u0002`^0M0K2F\u0010_\u001aB\u0012\u0004\u0012\u00020L\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170Nj\u0002`^0M0K8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eRÞ\u0001\u0010h\u001a\\\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001007j\u0002`f\u0012H\u0012F\u0012B\u0012@\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0\u0014j\u0002`*\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\r0+j\u0002`.0Nj\u0002`g0M0K2`\u0010_\u001a\\\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001007j\u0002`f\u0012H\u0012F\u0012B\u0012@\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0\u0014j\u0002`*\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\r0+j\u0002`.0Nj\u0002`g0M0K8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010a\u001a\u0004\bi\u0010c\"\u0004\bj\u0010eRª\u0001\u0010l\u001aB\u0012\u0004\u0012\u00020L\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170Nj\u0002`k0M0K2F\u0010_\u001aB\u0012\u0004\u0012\u00020L\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170Nj\u0002`k0M0K8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010a\u001a\u0004\bm\u0010c\"\u0004\bn\u0010eR¾\u0001\u0010p\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001007j\u0002`f\u00128\u00126\u00122\u00120\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140Nj\u0002`o0M0K2P\u0010_\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001007j\u0002`f\u00128\u00126\u00122\u00120\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140Nj\u0002`o0M0K8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010a\u001a\u0004\bq\u0010c\"\u0004\br\u0010eR¾\u0001\u0010t\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001007j\u0002`f\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170Nj\u0002`s0M0K2P\u0010_\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001007j\u0002`f\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170Nj\u0002`s0M0K8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010a\u001a\u0004\bu\u0010c\"\u0004\bv\u0010eR²\u0001\u0010x\u001aF\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001007j\u0002`f\u00122\u00120\u0012,\u0012*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0=\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170Nj\u0002`w0M0K2J\u0010_\u001aF\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001007j\u0002`f\u00122\u00120\u0012,\u0012*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0=\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170Nj\u0002`w0M0K8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010a\u001a\u0004\by\u0010c\"\u0004\bz\u0010eR\u009e\u0001\u0010|\u001a<\u0012\u0004\u0012\u00020\u0010\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140Nj\u0002`{0M0K2@\u0010_\u001a<\u0012\u0004\u0012\u00020\u0010\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140Nj\u0002`{0M0K8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010a\u001a\u0004\b}\u0010c\"\u0004\b~\u0010eR\u0014\u0010\u0082\u0001\u001a\u00020\u007f8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0084\u0001"}, m18067d2 = {"Lcom/revenuecat/purchases/common/Backend;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "eventsDispatcher", "Lcom/revenuecat/purchases/common/HTTPClient;", "httpClient", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/HTTPClient;Lcom/revenuecat/purchases/common/BackendHelper;)V", "Lmm/C;", "close", "()V", "", "appUserID", "", "appInBackground", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getCustomerInfo", "(Ljava/lang/String;ZLBm/k;LBm/n;)V", "purchaseToken", "isRestore", "finishTransactions", "", "subscriberAttributes", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "storeAppUserID", "marketplace", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "paywallPostReceiptData", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "Lcom/revenuecat/purchases/common/PostReceiptDataSuccessCallback;", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "postReceiptData", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lcom/revenuecat/purchases/common/ReceiptInfo;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;LBm/k;LBm/o;)V", "getOfferings", "newAppUserID", "onSuccessHandler", "onErrorHandler", "logIn", "(Ljava/lang/String;Ljava/lang/String;LBm/n;LBm/k;)V", "", "diagnosticsList", "postDiagnostics", "(Ljava/util/List;LBm/k;LBm/n;)V", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;", "paywallEventRequest", "Lkotlin/Function0;", "postPaywallEvents", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;LBm/a;LBm/n;)V", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "getProductEntitlementMapping", "(LBm/k;LBm/k;)V", "clearCaches", "", "responseCode", "purchasesError", "determinePostReceiptErrorHandlingBehavior", "(ILcom/revenuecat/purchases/PurchasesError;)Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", TokenNames.f32018S, TokenNames.f32010E, "", "Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;", "", "Lmm/l;", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "call", "cacheKey", "functions", "Lcom/revenuecat/purchases/common/Delay;", "delay", "addBackgroundAwareCallback", "(Ljava/util/Map;Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;Lmm/l;Lcom/revenuecat/purchases/common/Delay;)V", TokenNames.f32013K, "addCallback", "(Ljava/util/Map;Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Ljava/lang/Object;Lmm/l;Lcom/revenuecat/purchases/common/Delay;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/common/HTTPClient;", "Lcom/revenuecat/purchases/common/BackendHelper;", "Lcom/revenuecat/purchases/common/CustomerInfoCallback;", "<set-?>", "callbacks", "Ljava/util/Map;", "getCallbacks", "()Ljava/util/Map;", "setCallbacks", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/common/CallbackCacheKey;", "Lcom/revenuecat/purchases/common/PostReceiptCallback;", "postReceiptCallbacks", "getPostReceiptCallbacks", "setPostReceiptCallbacks", "Lcom/revenuecat/purchases/common/OfferingsCallback;", "offeringsCallbacks", "getOfferingsCallbacks", "setOfferingsCallbacks", "Lcom/revenuecat/purchases/common/IdentifyCallback;", "identifyCallbacks", "getIdentifyCallbacks", "setIdentifyCallbacks", "Lcom/revenuecat/purchases/common/DiagnosticsCallback;", "diagnosticsCallbacks", "getDiagnosticsCallbacks", "setDiagnosticsCallbacks", "Lcom/revenuecat/purchases/common/PaywallEventsCallback;", "paywallEventsCallbacks", "getPaywallEventsCallbacks", "setPaywallEventsCallbacks", "Lcom/revenuecat/purchases/common/ProductEntitlementCallback;", "productEntitlementCallbacks", "getProductEntitlementCallbacks", "setProductEntitlementCallbacks", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "getVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "verificationMode", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Backend {

    @Deprecated
    public static final String APP_USER_ID = "app_user_id";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String FETCH_TOKEN = "fetch_token";

    @Deprecated
    public static final String NEW_APP_USER_ID = "new_app_user_id";
    private final AppConfig appConfig;
    private final BackendHelper backendHelper;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<C17309l>> callbacks;
    private volatile Map<List<String>, List<C17309l>> diagnosticsCallbacks;
    private final Dispatcher dispatcher;
    private final Dispatcher eventsDispatcher;
    private final HTTPClient httpClient;
    private volatile Map<List<String>, List<C17309l>> identifyCallbacks;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<C17309l>> offeringsCallbacks;
    private volatile Map<List<String>, List<C17309l>> paywallEventsCallbacks;
    private volatile Map<List<String>, List<C17309l>> postReceiptCallbacks;
    private volatile Map<String, List<C17309l>> productEntitlementCallbacks;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m18067d2 = {"Lcom/revenuecat/purchases/common/Backend$Companion;", "", "()V", "APP_USER_ID", "", "FETCH_TOKEN", "NEW_APP_USER_ID", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Backend(AppConfig appConfig, Dispatcher dispatcher, Dispatcher eventsDispatcher, HTTPClient httpClient, BackendHelper backendHelper) {
        AbstractC16544l.m18094g(appConfig, "appConfig");
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        AbstractC16544l.m18094g(eventsDispatcher, "eventsDispatcher");
        AbstractC16544l.m18094g(httpClient, "httpClient");
        AbstractC16544l.m18094g(backendHelper, "backendHelper");
        this.appConfig = appConfig;
        this.dispatcher = dispatcher;
        this.eventsDispatcher = eventsDispatcher;
        this.httpClient = httpClient;
        this.backendHelper = backendHelper;
        this.callbacks = new LinkedHashMap();
        this.postReceiptCallbacks = new LinkedHashMap();
        this.offeringsCallbacks = new LinkedHashMap();
        this.identifyCallbacks = new LinkedHashMap();
        this.diagnosticsCallbacks = new LinkedHashMap();
        this.paywallEventsCallbacks = new LinkedHashMap();
        this.productEntitlementCallbacks = new LinkedHashMap();
    }

    private final synchronized <S, E> void addBackgroundAwareCallback(Map<BackgroundAwareCallbackCacheKey, List<C17309l>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, C17309l c17309l, Delay delay) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2;
        try {
            BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, false, 1, null);
            boolean zContainsKey = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
            if (backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey) {
                LogUtilsKt.debugLog(String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITHOUT_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1)));
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKeyCopy$default;
            } else {
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
            }
            addCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey2, c17309l, delay);
            BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default2 = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, true, 1, null);
            boolean zContainsKey2 = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
            if (!backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey2) {
                LogUtilsKt.debugLog(String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITH_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1)));
                List<C17309l> listRemove = map.remove(backgroundAwareCallbackCacheKeyCopy$default2);
                if (listRemove != null) {
                    List<C17309l> list = listRemove.isEmpty() ? null : listRemove;
                    if (list != null) {
                        if (map.containsKey(backgroundAwareCallbackCacheKey)) {
                            List<C17309l> list2 = map.get(backgroundAwareCallbackCacheKey);
                            if (list2 != null) {
                                list2.addAll(list);
                            }
                        } else {
                            map.put(backgroundAwareCallbackCacheKey, list);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void addBackgroundAwareCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, C17309l c17309l, Delay delay, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addBackgroundAwareCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey, c17309l, delay);
    }

    private final <K, S, E> void addCallback(Map<K, List<C17309l>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, K k8, C17309l c17309l, Delay delay) {
        if (!map.containsKey(k8)) {
            map.put(k8, AbstractC17681o.m19384m(c17309l));
            this.backendHelper.enqueue(asyncCall, dispatcher, delay);
        } else {
            LogUtilsKt.debugLog(String.format(NetworkStrings.SAME_CALL_ALREADY_IN_PROGRESS, Arrays.copyOf(new Object[]{k8}, 1)));
            List<C17309l> list = map.get(k8);
            AbstractC16544l.m18091d(list);
            list.add(c17309l);
        }
    }

    public static /* synthetic */ void addCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Object obj, C17309l c17309l, Delay delay, int i10, Object obj2) {
        if ((i10 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addCallback(map, asyncCall, dispatcher, obj, c17309l, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostReceiptErrorHandlingBehavior determinePostReceiptErrorHandlingBehavior(int responseCode, PurchasesError purchasesError) {
        if (RCHTTPStatusCodes.INSTANCE.isServerError(responseCode)) {
            return PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME;
        }
        return purchasesError.getCode() == PurchasesErrorCode.UnsupportedError ? PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME : PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED;
    }

    public final void clearCaches() {
        this.httpClient.clearCaches();
    }

    public final void close() {
        this.dispatcher.close();
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<C17309l>> getCallbacks() {
        return this.callbacks;
    }

    public final void getCustomerInfo(String appUserID, boolean appInBackground, InterfaceC1436k onSuccess, InterfaceC1439n onError) {
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey;
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        final Endpoint.GetCustomerInfo getCustomerInfo = new Endpoint.GetCustomerInfo(appUserID);
        String path = getCustomerInfo.getPath();
        synchronized (this) {
            try {
                backgroundAwareCallbackCacheKey = this.postReceiptCallbacks.isEmpty() ? new BackgroundAwareCallbackCacheKey(AbstractC9393x3.m9974d(path), appInBackground) : new BackgroundAwareCallbackCacheKey(AbstractC17680n.m19362l0(AbstractC9393x3.m9974d(path), String.valueOf(this.callbacks.size())), appInBackground);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getCustomerInfo$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getCustomerInfo, null, null, this.this$0.backendHelper.m14451x27ea44c3(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(result, "result");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    for (C17309l c17309l : listRemove) {
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c17309l.f55136Y;
                        InterfaceC1439n interfaceC1439n = (InterfaceC1439n) c17309l.f55137Z;
                        try {
                            if (BackendHelperKt.isSuccessful(result)) {
                                interfaceC1436k.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result));
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                                LogUtilsKt.errorLog(purchasesError);
                                interfaceC1439n.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode())));
                            }
                        } catch (JSONException e10) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e10);
                            LogUtilsKt.errorLog(purchasesError2);
                            interfaceC1439n.invoke(purchasesError2, Boolean.FALSE);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(error, "error");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1439n) ((C17309l) it.next()).f55137Z).invoke(error, Boolean.FALSE);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                addBackgroundAwareCallback(this.callbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey, new C17309l(onSuccess, onError), appInBackground ? Delay.DEFAULT : Delay.NONE);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized Map<List<String>, List<C17309l>> getDiagnosticsCallbacks() {
        return this.diagnosticsCallbacks;
    }

    public final synchronized Map<List<String>, List<C17309l>> getIdentifyCallbacks() {
        return this.identifyCallbacks;
    }

    public final void getOfferings(String appUserID, boolean appInBackground, InterfaceC1436k onSuccess, InterfaceC1439n onError) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        final Endpoint.GetOfferings getOfferings = new Endpoint.GetOfferings(appUserID);
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(AbstractC9393x3.m9974d(getOfferings.getPath()), appInBackground);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getOfferings$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getOfferings, null, null, this.this$0.backendHelper.m14451x27ea44c3(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(result, "result");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    for (C17309l c17309l : listRemove) {
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c17309l.f55136Y;
                        InterfaceC1439n interfaceC1439n = (InterfaceC1439n) c17309l.f55137Z;
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                interfaceC1436k.invoke(result.getBody());
                            } catch (JSONException e10) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e10);
                                LogUtilsKt.errorLog(purchasesError);
                                interfaceC1439n.invoke(purchasesError, Boolean.FALSE);
                            }
                        } else {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError2);
                            interfaceC1439n.invoke(purchasesError2, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode())));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(error, "error");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1439n) ((C17309l) it.next()).f55137Z).invoke(error, Boolean.FALSE);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                addBackgroundAwareCallback(this.offeringsCallbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey, new C17309l(onSuccess, onError), appInBackground ? Delay.DEFAULT : Delay.NONE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<C17309l>> getOfferingsCallbacks() {
        return this.offeringsCallbacks;
    }

    public final synchronized Map<List<String>, List<C17309l>> getPaywallEventsCallbacks() {
        return this.paywallEventsCallbacks;
    }

    public final synchronized Map<List<String>, List<C17309l>> getPostReceiptCallbacks() {
        return this.postReceiptCallbacks;
    }

    public final synchronized Map<String, List<C17309l>> getProductEntitlementCallbacks() {
        return this.productEntitlementCallbacks;
    }

    public final void getProductEntitlementMapping(InterfaceC1436k onSuccessHandler, InterfaceC1436k onErrorHandler) {
        AbstractC16544l.m18094g(onSuccessHandler, "onSuccessHandler");
        AbstractC16544l.m18094g(onErrorHandler, "onErrorHandler");
        final Endpoint.GetProductEntitlementMapping getProductEntitlementMapping = Endpoint.GetProductEntitlementMapping.INSTANCE;
        final String path = getProductEntitlementMapping.getPath();
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getProductEntitlementMapping$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getProductEntitlementMapping, null, null, this.this$0.backendHelper.m14451x27ea44c3(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(result, "result");
                Backend backend = this.this$0;
                String str = path;
                synchronized (backend) {
                    listRemove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    for (C17309l c17309l : listRemove) {
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c17309l.f55136Y;
                        InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) c17309l.f55137Z;
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                interfaceC1436k.invoke(ProductEntitlementMapping.INSTANCE.fromJson(result.getBody()));
                            } catch (JSONException e10) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e10);
                                LogUtilsKt.errorLog(purchasesError);
                                interfaceC1436k2.invoke(purchasesError);
                            }
                        } else {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError2);
                            interfaceC1436k2.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(error, "error");
                Backend backend = this.this$0;
                String str = path;
                synchronized (backend) {
                    listRemove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1436k) ((C17309l) it.next()).f55137Z).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.productEntitlementCallbacks, asyncCall, this.dispatcher, path, new C17309l(onSuccessHandler, onErrorHandler), Delay.LONG);
        }
    }

    public final SignatureVerificationMode getVerificationMode() {
        return this.httpClient.getSigningManager().getSignatureVerificationMode();
    }

    public final void logIn(final String appUserID, final String newAppUserID, InterfaceC1439n onSuccessHandler, InterfaceC1436k onErrorHandler) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(newAppUserID, "newAppUserID");
        AbstractC16544l.m18094g(onSuccessHandler, "onSuccessHandler");
        AbstractC16544l.m18094g(onErrorHandler, "onErrorHandler");
        final ArrayList arrayListM19315v = AbstractC17678l.m19315v(new String[]{appUserID, newAppUserID});
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$logIn$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.httpClient, this.appConfig.getBaseURL(), Endpoint.LogIn.INSTANCE, AbstractC17659D.m19244f(new C17309l(Backend.APP_USER_ID, appUserID), new C17309l(Backend.NEW_APP_USER_ID, newAppUserID)), AbstractC17681o.m19382k(new C17309l(Backend.APP_USER_ID, appUserID), new C17309l(Backend.NEW_APP_USER_ID, newAppUserID)), this.backendHelper.m14451x27ea44c3(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(result, "result");
                if (!BackendHelperKt.isSuccessful(result)) {
                    PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                    LogUtilsKt.errorLog(purchasesError);
                    onError(purchasesError);
                    return;
                }
                Backend backend = this;
                List<String> list = arrayListM19315v;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    for (C17309l c17309l : listRemove) {
                        InterfaceC1439n interfaceC1439n = (InterfaceC1439n) c17309l.f55136Y;
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c17309l.f55137Z;
                        boolean z6 = result.getResponseCode() == 201;
                        if (result.getBody().length() > 0) {
                            interfaceC1439n.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result), Boolean.valueOf(z6));
                        } else {
                            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.UnknownError, null, 2, null);
                            LogUtilsKt.errorLog(purchasesError2);
                            interfaceC1436k.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(error, "error");
                Backend backend = this;
                List<String> list = arrayListM19315v;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1436k) ((C17309l) it.next()).f55137Z).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.identifyCallbacks, asyncCall, this.dispatcher, arrayListM19315v, new C17309l(onSuccessHandler, onErrorHandler), null, 16, null);
        }
    }

    public final void postDiagnostics(List<? extends JSONObject> diagnosticsList, InterfaceC1436k onSuccessHandler, InterfaceC1439n onErrorHandler) {
        AbstractC16544l.m18094g(diagnosticsList, "diagnosticsList");
        AbstractC16544l.m18094g(onSuccessHandler, "onSuccessHandler");
        AbstractC16544l.m18094g(onErrorHandler, "onErrorHandler");
        List<? extends JSONObject> list = diagnosticsList;
        final ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((JSONObject) it.next()).hashCode()));
        }
        final Map mapM19258c = AbstractC17660E.m19258c(new C17309l("entries", new JSONArray((Collection) diagnosticsList)));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postDiagnostics$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, AppConfig.INSTANCE.getDiagnosticsURL(), Endpoint.PostDiagnostics.INSTANCE, mapM19258c, null, this.this$0.backendHelper.m14451x27ea44c3(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(result, "result");
                Backend backend = this.this$0;
                List<String> list2 = arrayList;
                synchronized (backend) {
                    listRemove = backend.getDiagnosticsCallbacks().remove(list2);
                }
                if (listRemove != null) {
                    for (C17309l c17309l : listRemove) {
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c17309l.f55136Y;
                        InterfaceC1439n interfaceC1439n = (InterfaceC1439n) c17309l.f55137Z;
                        if (BackendHelperKt.isSuccessful(result)) {
                            interfaceC1436k.invoke(result.getBody());
                        } else {
                            PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                            interfaceC1439n.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode()) || purchasesError.getCode() == PurchasesErrorCode.NetworkError));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(error, "error");
                Backend backend = this.this$0;
                List<String> list2 = arrayList;
                synchronized (backend) {
                    listRemove = backend.getDiagnosticsCallbacks().remove(list2);
                }
                if (listRemove != null) {
                    Iterator<T> it2 = listRemove.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1439n) ((C17309l) it2.next()).f55137Z).invoke(error, Boolean.valueOf(error.getCode() == PurchasesErrorCode.NetworkError));
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.diagnosticsCallbacks, asyncCall, this.eventsDispatcher, arrayList, new C17309l(onSuccessHandler, onErrorHandler), Delay.LONG);
        }
    }

    public final void postPaywallEvents(final PaywallEventRequest paywallEventRequest, InterfaceC1426a onSuccessHandler, InterfaceC1439n onErrorHandler) {
        AbstractC16544l.m18094g(paywallEventRequest, "paywallEventRequest");
        AbstractC16544l.m18094g(onSuccessHandler, "onSuccessHandler");
        AbstractC16544l.m18094g(onErrorHandler, "onErrorHandler");
        PaywallEventRequest.Companion companion = PaywallEventRequest.INSTANCE;
        AbstractC11516d json = companion.getJson();
        json.getClass();
        final Map<String, Object> mapAsMap = JsonElementExtensionsKt.asMap(json.m12904c(companion.serializer(), paywallEventRequest));
        if (mapAsMap == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "Error encoding paywall event request");
            LogUtilsKt.errorLog(purchasesError);
            onErrorHandler.invoke(purchasesError, Boolean.TRUE);
        } else {
            Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postPaywallEvents$call$1
                @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                public HTTPResult call() {
                    return HTTPClient.performRequest$default(this.this$0.httpClient, AppConfig.INSTANCE.getPaywallEventsURL(), Endpoint.PostPaywallEvents.INSTANCE, mapAsMap, null, this.this$0.backendHelper.m14451x27ea44c3(), false, 32, null);
                }

                @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                public void onCompletion(HTTPResult result) {
                    List<C17309l> listRemove;
                    AbstractC16544l.m18094g(result, "result");
                    Backend backend = this.this$0;
                    PaywallEventRequest paywallEventRequest2 = paywallEventRequest;
                    synchronized (backend) {
                        listRemove = backend.getPaywallEventsCallbacks().remove(paywallEventRequest2.getCacheKey());
                    }
                    if (listRemove != null) {
                        for (C17309l c17309l : listRemove) {
                            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) c17309l.f55136Y;
                            InterfaceC1439n interfaceC1439n = (InterfaceC1439n) c17309l.f55137Z;
                            if (BackendHelperKt.isSuccessful(result)) {
                                interfaceC1426a.invoke();
                            } else {
                                interfaceC1439n.invoke(ErrorsKt.toPurchasesError(result), Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isSynced(result.getResponseCode())));
                            }
                        }
                    }
                }

                @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                public void onError(PurchasesError error) {
                    List<C17309l> listRemove;
                    AbstractC16544l.m18094g(error, "error");
                    Backend backend = this.this$0;
                    PaywallEventRequest paywallEventRequest2 = paywallEventRequest;
                    synchronized (backend) {
                        listRemove = backend.getPaywallEventsCallbacks().remove(paywallEventRequest2.getCacheKey());
                    }
                    if (listRemove != null) {
                        Iterator<T> it = listRemove.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1439n) ((C17309l) it.next()).f55137Z).invoke(error, Boolean.TRUE);
                        }
                    }
                }
            };
            synchronized (this) {
                addCallback(this.paywallEventsCallbacks, asyncCall, this.eventsDispatcher, paywallEventRequest.getCacheKey(), new C17309l(onSuccessHandler, onErrorHandler), Delay.LONG);
            }
        }
    }

    public final synchronized void setCallbacks(Map<BackgroundAwareCallbackCacheKey, List<C17309l>> map) {
        AbstractC16544l.m18094g(map, "<set-?>");
        this.callbacks = map;
    }

    public final synchronized void setDiagnosticsCallbacks(Map<List<String>, List<C17309l>> map) {
        AbstractC16544l.m18094g(map, "<set-?>");
        this.diagnosticsCallbacks = map;
    }

    public final synchronized void setIdentifyCallbacks(Map<List<String>, List<C17309l>> map) {
        AbstractC16544l.m18094g(map, "<set-?>");
        this.identifyCallbacks = map;
    }

    public final synchronized void setOfferingsCallbacks(Map<BackgroundAwareCallbackCacheKey, List<C17309l>> map) {
        AbstractC16544l.m18094g(map, "<set-?>");
        this.offeringsCallbacks = map;
    }

    public final synchronized void setPaywallEventsCallbacks(Map<List<String>, List<C17309l>> map) {
        AbstractC16544l.m18094g(map, "<set-?>");
        this.paywallEventsCallbacks = map;
    }

    public final synchronized void setPostReceiptCallbacks(Map<List<String>, List<C17309l>> map) {
        AbstractC16544l.m18094g(map, "<set-?>");
        this.postReceiptCallbacks = map;
    }

    public final synchronized void setProductEntitlementCallbacks(Map<String, List<C17309l>> map) {
        AbstractC16544l.m18094g(map, "<set-?>");
        this.productEntitlementCallbacks = map;
    }

    public final void postReceiptData(String purchaseToken, String appUserID, boolean isRestore, boolean finishTransactions, Map<String, ? extends Map<String, ? extends Object>> subscriberAttributes, ReceiptInfo receiptInfo, String storeAppUserID, String marketplace, PostReceiptInitiationSource initiationSource, PaywallPostReceiptData paywallPostReceiptData, InterfaceC1436k onSuccess, InterfaceC1440o onError) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Price price;
        LegacyProrationMode asLegacyProrationMode;
        PresentedOfferingContext.TargetingContext targetingContext;
        AbstractC16544l.m18094g(purchaseToken, "purchaseToken");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(subscriberAttributes, "subscriberAttributes");
        AbstractC16544l.m18094g(receiptInfo, "receiptInfo");
        AbstractC16544l.m18094g(initiationSource, "initiationSource");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        final ArrayList arrayListM19315v = AbstractC17678l.m19315v(new String[]{purchaseToken, appUserID, String.valueOf(isRestore), String.valueOf(finishTransactions), subscriberAttributes.toString(), receiptInfo.toString(), storeAppUserID});
        C17309l c17309l = new C17309l(FETCH_TOKEN, purchaseToken);
        C17309l c17309l2 = new C17309l("product_ids", receiptInfo.getProductIDs());
        List<PlatformProductId> listM14456xcb82c11d = receiptInfo.m14456xcb82c11d();
        if (listM14456xcb82c11d != null) {
            List<PlatformProductId> list = listM14456xcb82c11d;
            arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlatformProductId) it.next()).getAsMap());
            }
        } else {
            arrayList = null;
        }
        C17309l c17309l3 = new C17309l("platform_product_ids", arrayList);
        C17309l c17309l4 = new C17309l(APP_USER_ID, appUserID);
        C17309l c17309l5 = new C17309l("is_restore", Boolean.valueOf(isRestore));
        PresentedOfferingContext presentedOfferingContext = receiptInfo.getPresentedOfferingContext();
        C17309l c17309l6 = new C17309l("presented_offering_identifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = receiptInfo.getPresentedOfferingContext();
        C17309l c17309l7 = new C17309l("presented_placement_identifier", presentedOfferingContext2 != null ? presentedOfferingContext2.getPlacementIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext3 = receiptInfo.getPresentedOfferingContext();
        C17309l c17309l8 = new C17309l("applied_targeting_rule", (presentedOfferingContext3 == null || (targetingContext = presentedOfferingContext3.getTargetingContext()) == null) ? null : AbstractC17659D.m19244f(new C17309l("revision", Integer.valueOf(targetingContext.getRevision())), new C17309l("rule_id", targetingContext.getRuleId())));
        C17309l c17309l9 = new C17309l("observer_mode", Boolean.valueOf(!finishTransactions));
        C17309l c17309l10 = new C17309l("price", receiptInfo.getPrice());
        C17309l c17309l11 = new C17309l("currency", receiptInfo.getCurrency());
        C17309l c17309l12 = new C17309l("attributes", (subscriberAttributes.isEmpty() || this.appConfig.getCustomEntitlementComputation()) ? null : subscriberAttributes);
        C17309l c17309l13 = new C17309l(nkFZpTrMPpn.IHVHngllM, receiptInfo.getDuration());
        C17309l c17309l14 = new C17309l("store_user_id", storeAppUserID);
        List<PricingPhase> pricingPhases = receiptInfo.getPricingPhases();
        if (pricingPhases != null) {
            List<PricingPhase> list2 = pricingPhases;
            arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(BackendKt.toMap((PricingPhase) it2.next()));
            }
        } else {
            arrayList2 = null;
        }
        C17309l c17309l15 = new C17309l("pricing_phases", arrayList2);
        ReplacementMode replacementMode = receiptInfo.getReplacementMode();
        GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
        final Map mapFilterNotNullValues = MapExtensionsKt.filterNotNullValues(AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, c17309l5, c17309l6, c17309l7, c17309l8, c17309l9, c17309l10, c17309l11, c17309l12, c17309l13, c17309l14, c17309l15, new C17309l("proration_mode", (googleReplacementMode == null || (asLegacyProrationMode = BackendKt.getAsLegacyProrationMode(googleReplacementMode)) == null) ? null : asLegacyProrationMode.name()), new C17309l("initiation_source", initiationSource.getPostReceiptFieldValue()), new C17309l("paywall", paywallPostReceiptData != null ? paywallPostReceiptData.toMap() : null)));
        final List listM19382k = AbstractC17681o.m19382k(new C17309l(APP_USER_ID, appUserID), new C17309l(FETCH_TOKEN, purchaseToken));
        StoreProduct storeProduct = receiptInfo.getStoreProduct();
        final Map mapFilterNotNullValues2 = MapExtensionsKt.filterNotNullValues(AbstractC17659D.m19244f(new C17309l("price_string", (storeProduct == null || (price = storeProduct.getPrice()) == null) ? null : price.getFormatted()), new C17309l("marketplace", marketplace)));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postReceiptData$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), Endpoint.PostReceipt.INSTANCE, mapFilterNotNullValues, listM19382k, AbstractC17659D.m19248j(this.this$0.backendHelper.m14451x27ea44c3(), mapFilterNotNullValues2), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(result, "result");
                Backend backend = this.this$0;
                List<String> list3 = arrayListM19315v;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list3);
                }
                if (listRemove != null) {
                    Backend backend2 = this.this$0;
                    for (C17309l c17309l16 : listRemove) {
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c17309l16.f55136Y;
                        InterfaceC1440o interfaceC1440o = (InterfaceC1440o) c17309l16.f55137Z;
                        try {
                            if (BackendHelperKt.isSuccessful(result)) {
                                interfaceC1436k.invoke(PostReceiptResponseKt.buildPostReceiptResponse(result));
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                                LogUtilsKt.errorLog(purchasesError);
                                interfaceC1440o.invoke(purchasesError, backend2.determinePostReceiptErrorHandlingBehavior(result.getResponseCode(), purchasesError), result.getBody());
                            }
                        } catch (JSONException e10) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e10);
                            LogUtilsKt.errorLog(purchasesError2);
                            interfaceC1440o.invoke(purchasesError2, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<C17309l> listRemove;
                AbstractC16544l.m18094g(error, "error");
                Backend backend = this.this$0;
                List<String> list3 = arrayListM19315v;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list3);
                }
                if (listRemove != null) {
                    Iterator<T> it3 = listRemove.iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC1440o) ((C17309l) it3.next()).f55137Z).invoke(error, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.postReceiptCallbacks, asyncCall, this.dispatcher, arrayListM19315v, new C17309l(onSuccess, onError), null, 16, null);
        }
    }
}
