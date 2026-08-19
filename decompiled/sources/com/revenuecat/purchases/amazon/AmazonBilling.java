package com.revenuecat.purchases.amazon;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.LWAConsentStatus;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.amazon.handler.ProductDataHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler;
import com.revenuecat.purchases.amazon.handler.UserDataHandler;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import org.json.JSONException;
import org.json.JSONObject;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1135yn.C21555b;
import p329N3.RunnableC5611a;
import p571X9.AbstractC9239Y;
import p571X9.AbstractC9393x3;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B}\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dBC\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u001e\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001c\u0010\"JT\u0010.\u001a\u00020*2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010&\u001a\u00020$2\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0096\u0001¢\u0006\u0004\b.\u0010/J^\u00108\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020)2\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020*042\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0096\u0001¢\u0006\u0004\b8\u00109JD\u0010:\u001a\u00020*2\u001e\u00107\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002050(\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020*042\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0096\u0001¢\u0006\u0004\b:\u0010;J8\u0010<\u001a\u00020*2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0096\u0001¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020*H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020*2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020*H\u0014¢\u0006\u0004\bD\u0010?JI\u0010I\u001a\u00020*2\u0006\u00102\u001a\u00020$2\u0018\u0010F\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0(\u0012\u0004\u0012\u00020*0'2\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'j\u0002`GH\u0016¢\u0006\u0004\bI\u0010JJO\u0010N\u001a\u00020*2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0016¢\u0006\u0004\bN\u0010OJ[\u0010T\u001a\u00020*2\u0006\u0010Q\u001a\u00020P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020$0#2\u001c\u0010+\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0004\u0012\u00020*0'j\u0002`S2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'j\u0002`GH\u0016¢\u0006\u0004\bT\u0010UJ/\u0010Y\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\u0006\u00108\u001a\u00020E2\u0006\u0010V\u001a\u00020\f2\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJO\u0010]\u001a\u00020*2\u0006\u00102\u001a\u00020$2\u0006\u0010Q\u001a\u00020P2\u0006\u0010[\u001a\u00020$2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0016¢\u0006\u0004\b]\u0010^JE\u0010f\u001a\u00020*2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020$2\u0006\u0010`\u001a\u00020_2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\fH\u0016¢\u0006\u0004\bh\u0010iJK\u0010:\u001a\u00020*2\u0006\u00102\u001a\u00020$2\u001e\u00107\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020E0j\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0016¢\u0006\u0004\b:\u0010JJ3\u0010o\u001a\u00020*2\u0006\u00101\u001a\u0002002\f\u0010l\u001a\b\u0012\u0004\u0012\u00020k0(2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020*0mH\u0016¢\u0006\u0004\bo\u0010pJ;\u0010q\u001a\u00020*2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020*0'2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'j\u0002`GH\u0016¢\u0006\u0004\bq\u0010=J;\u0010s\u001a\u00020*2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020*0'2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'j\u0002`GH\u0016¢\u0006\u0004\bs\u0010=J\u0017\u0010v\u001a\u00020*2\u0006\u0010u\u001a\u00020tH\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020*2\u0006\u0010u\u001a\u00020xH\u0016¢\u0006\u0004\by\u0010zJ\u0017\u0010|\u001a\u00020*2\u0006\u0010u\u001a\u00020{H\u0016¢\u0006\u0004\b|\u0010}J\u0018\u0010\u007f\u001a\u00020*2\u0006\u0010u\u001a\u00020~H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001JF\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020E0j*\b\u0012\u0004\u0012\u0002050(2\u0013\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0j2\u0007\u0010\u0082\u0001\u001a\u000206H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001d\u0010\u0086\u0001\u001a\u0004\u0018\u00010$2\u0007\u0010u\u001a\u00030\u0085\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J'\u0010\u0089\u0001\u001a\u00020*2\u0013\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020,0jH\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001JM\u0010:\u001a\u00020*2\u0007\u0010\u008b\u0001\u001a\u00020\f2\u001e\u00107\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020E0j\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0002¢\u0006\u0005\b:\u0010\u008c\u0001J\\\u0010\u008f\u0001\u001a\u00020*2\u0007\u0010\u008d\u0001\u001a\u00020$2\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u0002050(20\u0010\\\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0j\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020,0j\u0012\u0004\u0012\u00020*04H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J6\u0010\u0092\u0001\u001a\u00020*2\u0007\u0010\u0091\u0001\u001a\u0002052\u0007\u0010\u0082\u0001\u001a\u0002062\u0006\u00103\u001a\u00020)2\b\u0010d\u001a\u0004\u0018\u00010cH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001b\u0010\u0095\u0001\u001a\u00020*2\u0007\u0010\u0094\u0001\u001a\u00020,H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0097\u0001\u0010iJ)\u0010\u0099\u0001\u001a\u00020*2\u0015\u0010\u0098\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020*0'H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020*H\u0002¢\u0006\u0005\b\u009b\u0001\u0010?J\u001c\u0010\u009e\u0001\u001a\u00020*2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J%\u0010£\u0001\u001a\u00020*2\u0007\u0010 \u0001\u001a\u00020\f2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J%\u0010¥\u0001\u001a\u00020*2\u0007\u0010 \u0001\u001a\u00020\f2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0002¢\u0006\u0006\b¥\u0001\u0010¤\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010¦\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010§\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010¨\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010©\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010ª\u0001R\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010«\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010¬\u0001R\u0015\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u00ad\u0001R\u0015\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010®\u0001R\u0015\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010¯\u0001R\u0015\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010°\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010±\u0001R\u0019\u0010²\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010©\u0001R,\u0010´\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020*0'0³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001¨\u0006¶\u0001"}, m18067d2 = {"Lcom/revenuecat/purchases/amazon/AmazonBilling;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Landroid/content/Context;", "applicationContext", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "amazonBackend", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "cache", "", "finishTransactions", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "stateProvider", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "productDataHandler", "purchaseHandler", "purchaseUpdatesHandler", "userDataHandler", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/amazon/AmazonBackend;Lcom/revenuecat/purchases/amazon/AmazonCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;Lcom/revenuecat/purchases/common/DateProvider;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "diagnosticsTracker", "(Landroid/content/Context;Lcom/revenuecat/purchases/common/caching/DeviceCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/common/BackendHelper;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;)V", "", "", "skus", "marketplace", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lmm/C;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getProductData", "(Ljava/util/Set;Ljava/lang/String;LBm/k;LBm/k;)V", "Landroid/app/Activity;", "activity", "appUserID", "storeProduct", "Lkotlin/Function2;", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "onSuccess", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;LBm/n;LBm/k;)V", "queryPurchases", "(LBm/n;LBm/k;)V", "getUserData", "(LBm/k;LBm/k;)V", "startConnection", "()V", "", "delayMilliseconds", "startConnectionOnMainThread", "(J)V", "endConnection", "Lcom/revenuecat/purchases/models/StoreTransaction;", "onReceivePurchaseHistory", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onReceivePurchaseHistoryError", "queryAllPurchases", "(Ljava/lang/String;LBm/k;LBm/k;)V", "productID", "purchaseToken", "storeUserID", "normalizePurchaseData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/ProductType;", "productType", "productIds", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;LBm/k;LBm/k;)V", "shouldConsume", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;ZLcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "productId", "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;LBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "isConnected", "()Z", "", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;LBm/a;)V", "getStorefront", "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "getAmazonLWAConsentStatus", "Lcom/amazon/device/iap/model/UserDataResponse;", "response", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "tokensToSkusMap", "userData", "toMapOfReceiptHashesToRestoredPurchases", "(Ljava/util/List;Ljava/util/Map;Lcom/amazon/device/iap/model/UserData;)Ljava/util/Map;", "Lorg/json/JSONObject;", "getTermSkuFromJSON", "(Lorg/json/JSONObject;)Ljava/lang/String;", "errors", "logErrorsIfAny", "(Ljava/util/Map;)V", "filterOnlyActivePurchases", "(ZLBm/k;LBm/k;)V", "amazonUserID", "receipts", "getMissingSkusForReceipts", "(Ljava/lang/String;Ljava/util/List;LBm/n;)V", "receipt", "handleReceipt", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "error", "onPurchaseError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "shouldFinishTransactions", "request", "executeRequestOnUIThread", "(LBm/k;)V", "executePendingRequests", "Ljava/lang/Runnable;", "runnable", "runOnUIThread", "(Ljava/lang/Runnable;)V", "wasSuccessful", "Ljava/util/Date;", "requestStartTime", "trackAmazonQueryProductDetailsRequestIfNeeded", "(ZLjava/util/Date;)V", "trackAmazonQueryPurchasesRequestIfNeeded", "Landroid/content/Context;", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "Z", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/revenuecat/purchases/common/DateProvider;", "connected", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AmazonBilling extends BillingAbstract implements ProductDataResponseListener, PurchaseResponseListener, PurchaseUpdatesResponseListener, UserDataResponseListener {
    private final AmazonBackend amazonBackend;
    private final Context applicationContext;
    private final AmazonCache cache;
    private boolean connected;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final boolean finishTransactions;
    private final Handler mainHandler;
    private final ProductDataResponseListener productDataHandler;
    private final PurchaseResponseListener purchaseHandler;
    private final PurchaseUpdatesResponseListener purchaseUpdatesHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final ConcurrentLinkedQueue<InterfaceC1436k> serviceRequests;
    private final UserDataResponseListener userDataHandler;

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$consumeAndSave$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126601 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126601(StoreTransaction storeTransaction) {
            super(1);
            this.$purchase = storeTransaction;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.purchasingServiceProvider.notifyFulfillment(this.$purchase.getPurchaseToken(), FulfillmentResult.FULFILLED);
            } else {
                LogUtilsKt.errorLog(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$findPurchaseInPurchaseHistory$1 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "it", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126611 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onCompletion;
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ String $productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126611(InterfaceC1436k interfaceC1436k, String str, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$onCompletion = interfaceC1436k;
            this.$productId = str;
            this.$onError = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<StoreTransaction>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(List<StoreTransaction> it) {
            Object next;
            AbstractC16544l.m18094g(it, "it");
            String str = this.$productId;
            Iterator<T> it2 = it.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!AbstractC16544l.m18089b(str, ((StoreTransaction) next).getProductIds().get(0)));
            StoreTransaction storeTransaction = (StoreTransaction) next;
            if (storeTransaction != null) {
                this.$onCompletion.invoke(storeTransaction);
            } else {
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1))));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126621 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "Lmm/C;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ InterfaceC1436k $onError;
            final /* synthetic */ InterfaceC1436k $onSuccess;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1$1$WhenMappings */
            @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LWAConsentStatus.values().length];
                    try {
                        iArr[LWAConsentStatus.CONSENTED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LWAConsentStatus.UNAVAILABLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AmazonBilling amazonBilling, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$onSuccess = interfaceC1436k;
                this.$onError = interfaceC1436k2;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserData) obj);
                return C17296C.f55119a;
            }

            public final void invoke(UserData userData) {
                AmazonLWAConsentStatus amazonLWAConsentStatus;
                AbstractC16544l.m18094g(userData, "userData");
                LWAConsentStatus lWAConsentStatus = userData.getLWAConsentStatus();
                if (lWAConsentStatus == null) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_LWA_CONSENT_STATUS_NULL_STORE_PROBLEM));
                    return;
                }
                InterfaceC1436k interfaceC1436k = this.$onSuccess;
                int i10 = WhenMappings.$EnumSwitchMapping$0[lWAConsentStatus.ordinal()];
                if (i10 == 1) {
                    amazonLWAConsentStatus = AmazonLWAConsentStatus.CONSENTED;
                } else {
                    if (i10 != 2) {
                        throw new C0644w(17);
                    }
                    amazonLWAConsentStatus = AmazonLWAConsentStatus.UNAVAILABLE;
                }
                interfaceC1436k.invoke(amazonLWAConsentStatus);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ InterfaceC1436k $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC1436k interfaceC1436k) {
                super(1);
                this.$onError = interfaceC1436k;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return C17296C.f55119a;
            }

            public final void invoke(PurchasesError error) {
                AbstractC16544l.m18094g(error, "error");
                LogUtilsKt.errorLog$default(String.format(BillingStrings.BILLING_AMAZON_ERROR_LWA_CONSENT_STATUS, Arrays.copyOf(new Object[]{error}, 1)), null, 2, null);
                this.$onError.invoke(error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126621(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$onError = interfaceC1436k;
            this.$onSuccess = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new AnonymousClass1(AmazonBilling.this, this.$onSuccess, this.$onError), new AnonymousClass2(this.$onError));
            } else {
                LogUtilsKt.errorLog$default(String.format(BillingStrings.BILLING_CONNECTION_ERROR_LWA_CONSENT_STATUS, Arrays.copyOf(new Object[]{purchasesError}, 1)), null, 2, null);
                this.$onError.invoke(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126631 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "Lmm/C;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ InterfaceC1436k $onError;
            final /* synthetic */ InterfaceC1436k $onSuccess;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AmazonBilling amazonBilling, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$onSuccess = interfaceC1436k;
                this.$onError = interfaceC1436k2;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserData) obj);
                return C17296C.f55119a;
            }

            public final void invoke(UserData userData) {
                AbstractC16544l.m18094g(userData, "userData");
                String marketplace = userData.getMarketplace();
                if (marketplace == null) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_MARKETPLACE_NULL_STORE_PROBLEM));
                } else {
                    this.$onSuccess.invoke(marketplace);
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ InterfaceC1436k $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC1436k interfaceC1436k) {
                super(1);
                this.$onError = interfaceC1436k;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return C17296C.f55119a;
            }

            public final void invoke(PurchasesError error) {
                AbstractC16544l.m18094g(error, "error");
                LogUtilsKt.errorLog$default(String.format(BillingStrings.BILLING_AMAZON_ERROR_STOREFRONT, Arrays.copyOf(new Object[]{error}, 1)), null, 2, null);
                this.$onError.invoke(error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126631(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$onError = interfaceC1436k;
            this.$onSuccess = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new AnonymousClass1(AmazonBilling.this, this.$onSuccess, this.$onError), new AnonymousClass2(this.$onError));
            } else {
                LogUtilsKt.errorLog$default(String.format(BillingStrings.BILLING_CONNECTION_ERROR_STORE_COUNTRY, Arrays.copyOf(new Object[]{purchasesError}, 1)), null, 2, null);
                this.$onError.invoke(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$handleReceipt$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lorg/json/JSONObject;", "response", "Lmm/C;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126641 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ Receipt $receipt;
        final /* synthetic */ UserData $userData;
        final /* synthetic */ AmazonBilling this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126641(Receipt receipt, PresentedOfferingContext presentedOfferingContext, UserData userData, AmazonBilling amazonBilling) {
            super(1);
            this.$receipt = receipt;
            this.$presentedOfferingContext = presentedOfferingContext;
            this.$userData = userData;
            this.this$0 = amazonBilling;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((JSONObject) obj);
            return C17296C.f55119a;
        }

        public final void invoke(JSONObject response) throws JSONException {
            AbstractC16544l.m18094g(response, "response");
            Object obj = response.get("termSku");
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.String");
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(this.$receipt, (String) obj, this.$presentedOfferingContext, PurchaseState.PURCHASED, this.$userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(AbstractC9393x3.m9974d(storeTransaction));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$handleReceipt$2 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C126652 extends AbstractC16541i implements InterfaceC1436k {
        public C126652(Object obj) {
            super(1, 0, AmazonBilling.class, obj, "onPurchaseError", "onPurchaseError(Lcom/revenuecat/purchases/PurchasesError;)V");
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError p10) {
            AbstractC16544l.m18094g(p10, "p0");
            ((AmazonBilling) this.receiver).onPurchaseError(p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126661 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ AmazonStoreProduct $storeProduct;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/amazon/device/iap/model/Receipt;", "receipt", "Lcom/amazon/device/iap/model/UserData;", "userData", "Lmm/C;", "invoke", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1439n {
            final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
            final /* synthetic */ AmazonStoreProduct $storeProduct;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AmazonBilling amazonBilling, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
                super(2);
                this.this$0 = amazonBilling;
                this.$storeProduct = amazonStoreProduct;
                this.$presentedOfferingContext = presentedOfferingContext;
            }

            @Override // p049Bm.InterfaceC1439n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Receipt) obj, (UserData) obj2);
                return C17296C.f55119a;
            }

            public final void invoke(Receipt receipt, UserData userData) {
                AbstractC16544l.m18094g(receipt, "receipt");
                AbstractC16544l.m18094g(userData, "userData");
                this.this$0.handleReceipt(receipt, userData, this.$storeProduct, this.$presentedOfferingContext);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AmazonBilling amazonBilling) {
                super(1);
                this.this$0 = amazonBilling;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return C17296C.f55119a;
            }

            public final void invoke(PurchasesError it) {
                AbstractC16544l.m18094g(it, "it");
                this.this$0.onPurchaseError(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126661(Activity activity, String str, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
            super(1);
            this.$activity = activity;
            this.$appUserID = str;
            this.$storeProduct = amazonStoreProduct;
            this.$presentedOfferingContext = presentedOfferingContext;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                AmazonBilling.this.onPurchaseError(purchasesError);
                return;
            }
            PurchaseResponseListener purchaseResponseListener = AmazonBilling.this.purchaseHandler;
            Handler handler = AmazonBilling.this.mainHandler;
            Activity activity = this.$activity;
            String str = this.$appUserID;
            AmazonStoreProduct amazonStoreProduct = this.$storeProduct;
            purchaseResponseListener.purchase(handler, activity, str, amazonStoreProduct, new AnonymousClass1(AmazonBilling.this, amazonStoreProduct, this.$presentedOfferingContext), new AnonymousClass2(AmazonBilling.this));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$normalizePurchaseData$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lorg/json/JSONObject;", "response", "Lmm/C;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126672 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126672(InterfaceC1436k interfaceC1436k, String str, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$onError = interfaceC1436k;
            this.$purchaseToken = str;
            this.$onSuccess = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return C17296C.f55119a;
        }

        public final void invoke(JSONObject response) {
            AbstractC16544l.m18094g(response, "response");
            AbstractC12107L1.m13831v(new Object[]{response.toString()}, 1, AmazonStrings.RECEIPT_DATA_RECEIVED, LogIntent.DEBUG);
            String termSkuFromJSON = AmazonBilling.this.getTermSkuFromJSON(response);
            if (termSkuFromJSON == null) {
                this.$onError.invoke(ErrorsKt.missingTermSkuError(response));
            } else {
                AmazonBilling.this.cache.cacheSkusByToken(AbstractC17660E.m19258c(new C17309l(this.$purchaseToken, termSkuFromJSON)));
                this.$onSuccess.invoke(termSkuFromJSON);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$normalizePurchaseData$3 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126683 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126683(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$onError = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC16544l.m18094g(error, "error");
            this.$onError.invoke(ErrorsKt.errorGettingReceiptInfo(error));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryAllPurchases$1 */
    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "it", "Lmm/C;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126691 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onReceivePurchaseHistory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126691(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$onReceivePurchaseHistory = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, StoreTransaction>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Map<String, StoreTransaction> it) {
            AbstractC16544l.m18094g(it, "it");
            this.$onReceivePurchaseHistory.invoke(AbstractC17680n.m19322C0(it.values()));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126701 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onReceive;
        final /* synthetic */ Set<String> $productIds;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "Lmm/C;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ InterfaceC1436k $onError;
            final /* synthetic */ InterfaceC1436k $onReceive;
            final /* synthetic */ Set<String> $productIds;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "it", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
            public static final class C222281 extends AbstractC16546n implements InterfaceC1436k {
                final /* synthetic */ InterfaceC1436k $onReceive;
                final /* synthetic */ Date $requestStartTime;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C222281(AmazonBilling amazonBilling, Date date, InterfaceC1436k interfaceC1436k) {
                    super(1);
                    this.this$0 = amazonBilling;
                    this.$requestStartTime = date;
                    this.$onReceive = interfaceC1436k;
                }

                @Override // p049Bm.InterfaceC1436k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List<? extends StoreProduct>) obj);
                    return C17296C.f55119a;
                }

                public final void invoke(List<? extends StoreProduct> it) {
                    AbstractC16544l.m18094g(it, "it");
                    this.this$0.trackAmazonQueryProductDetailsRequestIfNeeded(true, this.$requestStartTime);
                    this.$onReceive.invoke(it);
                }
            }

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1$2, reason: invalid class name */
            @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
            public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {
                final /* synthetic */ InterfaceC1436k $onError;
                final /* synthetic */ Date $requestStartTime;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(AmazonBilling amazonBilling, Date date, InterfaceC1436k interfaceC1436k) {
                    super(1);
                    this.this$0 = amazonBilling;
                    this.$requestStartTime = date;
                    this.$onError = interfaceC1436k;
                }

                @Override // p049Bm.InterfaceC1436k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PurchasesError) obj);
                    return C17296C.f55119a;
                }

                public final void invoke(PurchasesError it) {
                    AbstractC16544l.m18094g(it, "it");
                    this.this$0.trackAmazonQueryProductDetailsRequestIfNeeded(false, this.$requestStartTime);
                    this.$onError.invoke(it);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AmazonBilling amazonBilling, Set<String> set, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$productIds = set;
                this.$onReceive = interfaceC1436k;
                this.$onError = interfaceC1436k2;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserData) obj);
                return C17296C.f55119a;
            }

            public final void invoke(UserData userData) {
                AbstractC16544l.m18094g(userData, "userData");
                Date now = this.this$0.dateProvider.getNow();
                ProductDataResponseListener productDataResponseListener = this.this$0.productDataHandler;
                Set<String> set = this.$productIds;
                String marketplace = userData.getMarketplace();
                AbstractC16544l.m18093f(marketplace, "userData.marketplace");
                productDataResponseListener.getProductData(set, marketplace, new C222281(this.this$0, now, this.$onReceive), new AnonymousClass2(this.this$0, now, this.$onError));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126701(InterfaceC1436k interfaceC1436k, Set<String> set, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$onError = interfaceC1436k;
            this.$productIds = set;
            this.$onReceive = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new AnonymousClass1(AmazonBilling.this, this.$productIds, this.$onReceive, this.$onError), this.$onError);
            } else {
                this.$onError.invoke(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126711 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ boolean $filterOnlyActivePurchases;
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18067d2 = {"", "Lcom/amazon/device/iap/model/Receipt;", "receipts", "Lcom/amazon/device/iap/model/UserData;", "userData", "Lmm/C;", "invoke", "(Ljava/util/List;Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1439n {
            final /* synthetic */ boolean $filterOnlyActivePurchases;
            final /* synthetic */ InterfaceC1436k $onError;
            final /* synthetic */ InterfaceC1436k $onSuccess;
            final /* synthetic */ Date $requestStartTime;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18067d2 = {"", "", "tokensToSkusMap", "Lcom/revenuecat/purchases/PurchasesError;", "errors", "Lmm/C;", "invoke", "(Ljava/util/Map;Ljava/util/Map;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
            public static final class C222291 extends AbstractC16546n implements InterfaceC1439n {
                final /* synthetic */ List<Receipt> $filteredReceipts;
                final /* synthetic */ InterfaceC1436k $onError;
                final /* synthetic */ InterfaceC1436k $onSuccess;
                final /* synthetic */ UserData $userData;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C222291(AmazonBilling amazonBilling, InterfaceC1436k interfaceC1436k, List<Receipt> list, UserData userData, InterfaceC1436k interfaceC1436k2) {
                    super(2);
                    this.this$0 = amazonBilling;
                    this.$onError = interfaceC1436k;
                    this.$filteredReceipts = list;
                    this.$userData = userData;
                    this.$onSuccess = interfaceC1436k2;
                }

                @Override // p049Bm.InterfaceC1439n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Map<String, String>) obj, (Map<String, PurchasesError>) obj2);
                    return C17296C.f55119a;
                }

                public final void invoke(Map<String, String> tokensToSkusMap, Map<String, PurchasesError> errors) {
                    AbstractC16544l.m18094g(tokensToSkusMap, "tokensToSkusMap");
                    AbstractC16544l.m18094g(errors, "errors");
                    this.this$0.logErrorsIfAny(errors);
                    if (tokensToSkusMap.isEmpty()) {
                        this.$onError.invoke(new PurchasesError(PurchasesErrorCode.InvalidReceiptError, AmazonStrings.ERROR_FETCHING_PURCHASE_HISTORY_ALL_RECEIPTS_INVALID));
                    } else {
                        this.$onSuccess.invoke(this.this$0.toMapOfReceiptHashesToRestoredPurchases(this.$filteredReceipts, tokensToSkusMap, this.$userData));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AmazonBilling amazonBilling, Date date, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
                super(2);
                this.this$0 = amazonBilling;
                this.$requestStartTime = date;
                this.$filterOnlyActivePurchases = z6;
                this.$onSuccess = interfaceC1436k;
                this.$onError = interfaceC1436k2;
            }

            @Override // p049Bm.InterfaceC1439n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((List<Receipt>) obj, (UserData) obj2);
                return C17296C.f55119a;
            }

            public final void invoke(List<Receipt> receipts, UserData userData) {
                AbstractC16544l.m18094g(receipts, "receipts");
                AbstractC16544l.m18094g(userData, "userData");
                this.this$0.trackAmazonQueryPurchasesRequestIfNeeded(true, this.$requestStartTime);
                if (this.$filterOnlyActivePurchases) {
                    AmazonBilling amazonBilling = this.this$0;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : receipts) {
                        Receipt receipt = (Receipt) obj;
                        if (receipt.getCancelDate() == null || receipt.getCancelDate().compareTo(amazonBilling.dateProvider.getNow()) > 0) {
                            arrayList.add(obj);
                        }
                    }
                    receipts = arrayList;
                }
                if (receipts.isEmpty()) {
                    this.$onSuccess.invoke(C17690x.f56481Y);
                    return;
                }
                AmazonBilling amazonBilling2 = this.this$0;
                String userId = userData.getUserId();
                AbstractC16544l.m18093f(userId, "userData.userId");
                amazonBilling2.getMissingSkusForReceipts(userId, receipts, new C222291(this.this$0, this.$onError, receipts, userData, this.$onSuccess));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ InterfaceC1436k $onError;
            final /* synthetic */ Date $requestStartTime;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AmazonBilling amazonBilling, Date date, InterfaceC1436k interfaceC1436k) {
                super(1);
                this.this$0 = amazonBilling;
                this.$requestStartTime = date;
                this.$onError = interfaceC1436k;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return C17296C.f55119a;
            }

            public final void invoke(PurchasesError it) {
                AbstractC16544l.m18094g(it, "it");
                this.this$0.trackAmazonQueryPurchasesRequestIfNeeded(false, this.$requestStartTime);
                this.$onError.invoke(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126711(InterfaceC1436k interfaceC1436k, boolean z6, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$onError = interfaceC1436k;
            this.$filterOnlyActivePurchases = z6;
            this.$onSuccess = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                this.$onError.invoke(purchasesError);
            } else {
                Date now = AmazonBilling.this.dateProvider.getNow();
                AmazonBilling.this.purchaseUpdatesHandler.queryPurchases(new AnonymousClass1(AmazonBilling.this, now, this.$filterOnlyActivePurchases, this.$onSuccess, this.$onError), new AnonymousClass2(AmazonBilling.this, now, this.$onError));
            }
        }
    }

    public /* synthetic */ AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z6, Handler handler, PurchasesStateProvider purchasesStateProvider, DiagnosticsTracker diagnosticsTracker, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        UserDataResponseListener userDataHandler;
        PurchasingServiceProvider defaultPurchasingServiceProvider = (i10 & 128) != 0 ? new DefaultPurchasingServiceProvider() : purchasingServiceProvider;
        ProductDataResponseListener productDataHandler = (i10 & 256) != 0 ? new ProductDataHandler(defaultPurchasingServiceProvider, handler) : productDataResponseListener;
        PurchaseResponseListener purchaseHandler = (i10 & 512) != 0 ? new PurchaseHandler(defaultPurchasingServiceProvider, context) : purchaseResponseListener;
        PurchaseUpdatesResponseListener purchaseUpdatesHandler = (i10 & 1024) != 0 ? new PurchaseUpdatesHandler(defaultPurchasingServiceProvider) : purchaseUpdatesResponseListener;
        if ((i10 & 2048) != 0) {
            userDataHandler = new UserDataHandler(defaultPurchasingServiceProvider, handler, null, 4, null);
        } else {
            userDataHandler = userDataResponseListener;
        }
        this(context, amazonBackend, amazonCache, z6, handler, purchasesStateProvider, diagnosticsTracker, defaultPurchasingServiceProvider, productDataHandler, purchaseHandler, purchaseUpdatesHandler, userDataHandler, (i10 & 4096) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    private final void executePendingRequests() {
        synchronized (this) {
            while (getConnected() && !this.serviceRequests.isEmpty()) {
                runOnUIThread(new RunnableC5611a(this.serviceRequests.remove(), 25));
            }
        }
    }

    private final synchronized void executeRequestOnUIThread(InterfaceC1436k request) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(request);
                if (getConnected()) {
                    executePendingRequests();
                } else {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getMissingSkusForReceipts(String amazonUserID, List<Receipt> receipts, InterfaceC1439n onCompletion) {
        AmazonBilling amazonBilling = this;
        Map<String, String> receiptSkus = amazonBilling.cache.getReceiptSkus();
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(receiptSkus);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Receipt> list = receipts;
        ArrayList<Receipt> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Receipt) obj).getProductType() != ProductType.SUBSCRIPTION) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        for (Receipt receipt : arrayList) {
            arrayList2.add(AbstractC9239Y.m9815b(receipt.getReceiptId(), receipt.getSku()));
        }
        AbstractC17659D.m19251m(linkedHashMapM19256r, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (((Receipt) obj2).getProductType() == ProductType.SUBSCRIPTION) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<Receipt> arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (!receiptSkus.containsKey(((Receipt) obj3).getReceiptId())) {
                arrayList4.add(obj3);
            }
        }
        if (arrayList4.isEmpty()) {
            onCompletion.invoke(linkedHashMapM19256r, linkedHashMap);
            return;
        }
        C16558z c16558z = new C16558z();
        c16558z.f51287Y = arrayList4.size();
        for (Receipt receipt2 : arrayList4) {
            AmazonBackend amazonBackend = amazonBilling.amazonBackend;
            String receiptId = receipt2.getReceiptId();
            AbstractC16544l.m18093f(receiptId, "receipt.receiptId");
            amazonBackend.getAmazonReceiptData(receiptId, amazonUserID, new AmazonBilling$getMissingSkusForReceipts$1$1(linkedHashMapM19256r, receipt2, c16558z, this, onCompletion, linkedHashMap), new AmazonBilling$getMissingSkusForReceipts$1$2(linkedHashMap, receipt2, c16558z, onCompletion, linkedHashMapM19256r));
            amazonBilling = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTermSkuFromJSON(JSONObject response) {
        try {
            return response.getString("termSku");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleReceipt(Receipt receipt, UserData userData, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        if (receipt.getProductType() != ProductType.SUBSCRIPTION) {
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, storeProduct.getId(), presentedOfferingContext, PurchaseState.PURCHASED, userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(AbstractC9393x3.m9974d(storeTransaction));
                return;
            }
            return;
        }
        AmazonBackend amazonBackend = this.amazonBackend;
        String receiptId = receipt.getReceiptId();
        AbstractC16544l.m18093f(receiptId, "receipt.receiptId");
        String userId = userData.getUserId();
        AbstractC16544l.m18093f(userId, "userData.userId");
        amazonBackend.getAmazonReceiptData(receiptId, userId, new C126641(receipt, presentedOfferingContext, userData, this), new C126652(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logErrorsIfAny(Map<String, PurchasesError> errors) {
        if (errors.isEmpty()) {
            return;
        }
        AbstractC12107L1.m13831v(new Object[]{AbstractC17680n.m19349Y(errors.keySet(), Separators.RETURN, null, null, 0, null, null, 62)}, 1, AmazonStrings.ERROR_FETCHING_RECEIPTS, LogIntent.AMAZON_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchaseError(PurchasesError error) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(error);
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (AbstractC16544l.m18089b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    private final boolean shouldFinishTransactions() {
        if (this.finishTransactions) {
            return true;
        }
        LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.WARNING_AMAZON_NOT_FINISHING_TRANSACTIONS);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConnectionOnMainThread$lambda$0(AmazonBilling this$0) {
        AbstractC16544l.m18094g(this$0, "this$0");
        this$0.startConnection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfReceiptHashesToRestoredPurchases(List<Receipt> list, Map<String, String> map, UserData userData) {
        ArrayList arrayList = new ArrayList();
        for (Receipt receipt : list) {
            String str = map.get(receipt.getReceiptId());
            C17309l c17309lM9815b = null;
            if (str == null) {
                LogWrapperKt.log(LogIntent.AMAZON_ERROR, AmazonStrings.ERROR_FINDING_RECEIPT_SKU);
            } else {
                StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, str, null, PurchaseState.UNSPECIFIED_STATE, userData);
                String receiptId = receipt.getReceiptId();
                AbstractC16544l.m18093f(receiptId, "receipt.receiptId");
                c17309lM9815b = AbstractC9239Y.m9815b(UtilsKt.sha1(receiptId), storeTransaction);
            }
            if (c17309lM9815b != null) {
                arrayList.add(c17309lM9815b);
            }
        }
        return AbstractC17659D.m19253o(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackAmazonQueryProductDetailsRequestIfNeeded(boolean wasSuccessful, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.m22504trackAmazonQueryProductDetailsRequestVtjQ1oo(DurationExtensionsKt.between(C21555b.f68260Z, requestStartTime, this.dateProvider.getNow()), wasSuccessful);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackAmazonQueryPurchasesRequestIfNeeded(boolean wasSuccessful, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.m22505trackAmazonQueryPurchasesRequestVtjQ1oo(DurationExtensionsKt.between(C21555b.f68260Z, requestStartTime, this.dateProvider.getNow()), wasSuccessful);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean finishTransactions, StoreTransaction purchase, boolean shouldConsume, PostReceiptInitiationSource initiationSource) {
        AbstractC16544l.m18094g(purchase, "purchase");
        AbstractC16544l.m18094g(initiationSource, "initiationSource");
        if (!shouldFinishTransactions() || purchase.getType() == com.revenuecat.purchases.ProductType.UNKNOWN || purchase.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        if (finishTransactions) {
            executeRequestOnUIThread(new C126601(purchase));
        }
        this.cache.addSuccessfullyPostedToken(purchase.getPurchaseToken());
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void endConnection() {
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String appUserID, com.revenuecat.purchases.ProductType productType, String productId, InterfaceC1436k onCompletion, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(productType, "productType");
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(onCompletion, "onCompletion");
        AbstractC16544l.m18094g(onError, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{productId, productType.name()}, 2)));
        queryAllPurchases(appUserID, new C126611(onCompletion, productId, onError), onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getAmazonLWAConsentStatus(InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        executeRequestOnUIThread(new C126621(onError, onSuccess));
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener
    public void getProductData(Set<String> skus, String marketplace, InterfaceC1436k onReceive, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(skus, "skus");
        AbstractC16544l.m18094g(marketplace, "marketplace");
        AbstractC16544l.m18094g(onReceive, "onReceive");
        AbstractC16544l.m18094g(onError, "onError");
        this.productDataHandler.getProductData(skus, marketplace, onReceive, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getStorefront(InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        executeRequestOnUIThread(new C126631(onError, onSuccess));
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void getUserData(InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        this.userDataHandler.getUserData(onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    /* JADX INFO: renamed from: isConnected, reason: from getter */
    public boolean getConnected() {
        return this.connected;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean isPersonalizedPrice) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(purchasingData, "purchasingData");
        AmazonPurchasingData.Product product = purchasingData instanceof AmazonPurchasingData.Product ? (AmazonPurchasingData.Product) purchasingData : null;
        if (product == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Amazon", "AmazonPurchaseInfo"}, 2)));
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                return;
            }
            return;
        }
        AmazonStoreProduct storeProduct = product.getStoreProduct();
        if (shouldFinishTransactions()) {
            if (replaceProductInfo != null) {
                LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.PRODUCT_CHANGES_NOT_SUPPORTED);
            } else {
                executeRequestOnUIThread(new C126661(activity, appUserID, storeProduct, presentedOfferingContext));
            }
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void normalizePurchaseData(String productID, String purchaseToken, String storeUserID, InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(productID, "productID");
        AbstractC16544l.m18094g(purchaseToken, "purchaseToken");
        AbstractC16544l.m18094g(storeUserID, "storeUserID");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        String str = this.cache.getReceiptSkus().get(purchaseToken);
        if (str != null) {
            onSuccess.invoke(str);
        } else {
            this.amazonBackend.getAmazonReceiptData(purchaseToken, storeUserID, new C126672(onError, purchaseToken, onSuccess), new C126683(onError));
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse response) {
        AbstractC16544l.m18094g(response, "response");
        if (shouldFinishTransactions()) {
            this.productDataHandler.onProductDataResponse(response);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse response) {
        AbstractC16544l.m18094g(response, "response");
        if (shouldFinishTransactions()) {
            this.purchaseHandler.onPurchaseResponse(response);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse response) {
        AbstractC16544l.m18094g(response, "response");
        if (shouldFinishTransactions()) {
            this.purchaseUpdatesHandler.onPurchaseUpdatesResponse(response);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse response) {
        AbstractC16544l.m18094g(response, "response");
        if (shouldFinishTransactions()) {
            this.userDataHandler.onUserDataResponse(response);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener
    public void purchase(Handler mainHandler, Activity activity, String appUserID, StoreProduct storeProduct, InterfaceC1439n onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(mainHandler, "mainHandler");
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(storeProduct, "storeProduct");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        this.purchaseHandler.purchase(mainHandler, activity, appUserID, storeProduct, onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String appUserID, InterfaceC1436k onReceivePurchaseHistory, InterfaceC1436k onReceivePurchaseHistoryError) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        AbstractC16544l.m18094g(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        queryPurchases(false, (InterfaceC1436k) new C126691(onReceivePurchaseHistory), onReceivePurchaseHistoryError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(com.revenuecat.purchases.ProductType productType, Set<String> productIds, InterfaceC1436k onReceive, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(productType, "productType");
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(onReceive, "onReceive");
        AbstractC16544l.m18094g(onError, "onError");
        if (shouldFinishTransactions()) {
            executeRequestOnUIThread(new C126701(onError, productIds, onReceive));
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void queryPurchases(InterfaceC1439n onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        this.purchaseUpdatesHandler.queryPurchases(onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, InterfaceC1426a subscriptionStatusChange) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(inAppMessageTypes, "inAppMessageTypes");
        AbstractC16544l.m18094g(subscriptionStatusChange, "subscriptionStatusChange");
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        if (shouldFinishTransactions()) {
            this.purchasingServiceProvider.registerListener(this.applicationContext, this);
            this.connected = true;
            BillingAbstract.StateListener stateListener = getStateListener();
            if (stateListener != null) {
                stateListener.onConnected();
            }
            executePendingRequests();
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long delayMilliseconds) {
        runOnUIThread(new RunnableC5611a(this, 26));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String appUserID, InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, tpXhEMGxfXFVSh.bPmccMKXbTxyIb);
        if (shouldFinishTransactions()) {
            queryPurchases(true, onSuccess, onError);
        }
    }

    private final void queryPurchases(boolean filterOnlyActivePurchases, InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        executeRequestOnUIThread(new C126711(onError, filterOnlyActivePurchases, onSuccess));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context applicationContext, AmazonBackend amazonBackend, AmazonCache cache, boolean z6, Handler mainHandler, PurchasesStateProvider stateProvider, DiagnosticsTracker diagnosticsTracker, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataHandler, PurchaseResponseListener purchaseHandler, PurchaseUpdatesResponseListener purchaseUpdatesHandler, UserDataResponseListener userDataHandler, DateProvider dateProvider) {
        super(stateProvider);
        AbstractC16544l.m18094g(applicationContext, "applicationContext");
        AbstractC16544l.m18094g(amazonBackend, "amazonBackend");
        AbstractC16544l.m18094g(cache, "cache");
        AbstractC16544l.m18094g(mainHandler, "mainHandler");
        AbstractC16544l.m18094g(stateProvider, "stateProvider");
        AbstractC16544l.m18094g(purchasingServiceProvider, "purchasingServiceProvider");
        AbstractC16544l.m18094g(productDataHandler, "productDataHandler");
        AbstractC16544l.m18094g(purchaseHandler, "purchaseHandler");
        AbstractC16544l.m18094g(purchaseUpdatesHandler, "purchaseUpdatesHandler");
        AbstractC16544l.m18094g(userDataHandler, "userDataHandler");
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        this.applicationContext = applicationContext;
        this.amazonBackend = amazonBackend;
        this.cache = cache;
        this.finishTransactions = z6;
        this.mainHandler = mainHandler;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.productDataHandler = productDataHandler;
        this.purchaseHandler = purchaseHandler;
        this.purchaseUpdatesHandler = purchaseUpdatesHandler;
        this.userDataHandler = userDataHandler;
        this.dateProvider = dateProvider;
        this.serviceRequests = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context applicationContext, DeviceCache cache, boolean z6, Handler mainHandler, BackendHelper backendHelper, PurchasesStateProvider stateProvider, DiagnosticsTracker diagnosticsTracker) {
        this(applicationContext, new AmazonBackend(backendHelper), new AmazonCache(cache), z6, mainHandler, stateProvider, diagnosticsTracker, null, null, null, null, null, null, 8064, null);
        AbstractC16544l.m18094g(applicationContext, "applicationContext");
        AbstractC16544l.m18094g(cache, "cache");
        AbstractC16544l.m18094g(mainHandler, "mainHandler");
        AbstractC16544l.m18094g(backendHelper, "backendHelper");
        AbstractC16544l.m18094g(stateProvider, "stateProvider");
    }
}
